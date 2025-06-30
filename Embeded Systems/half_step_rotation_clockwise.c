#include <lpc214x.h>
#include <stdint.h>

// Delay function: ~1 ms delay assuming Cclk = 60 MHz
void delay_ms(uint16_t j)
{
    uint16_t x, i;
    for (i = 0; i < j; i++) {
        for (x = 0; x < 6000; x++); // Delay loop
    }
}

int main(void)
{
    // Configure P0.0 to P0.3 as GPIO output (for controlling stepper motor)
    PINSEL0 = 0x00000000;
    IO0DIR |= 0x0000000F; // Set P0.0 to P0.3 as output

    while (1)
    {
        // Half-step clockwise sequence for stepper motor (8 steps)
        IO0PIN = (IO0PIN | 0x01) & 0xFFFFFFF1; // 0001
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x03) & 0xFFFFFFF3; // 0011
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x02) & 0xFFFFFFF2; // 0010
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x06) & 0xFFFFFFF6; // 0110
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x04) & 0xFFFFFFF4; // 0100
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x0C) & 0xFFFFFFFC; // 1100
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x08) & 0xFFFFFFF8; // 1000
        delay_ms(100);

        IO0PIN = (IO0PIN | 0x09) & 0xFFFFFFF9; // 1001
        delay_ms(100);
    }
}
