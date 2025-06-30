#include <lpc214x.h>

// Delay function: Approx ~1 ms delay per iteration (for 60 MHz clock)
void delay(unsigned int time)
{
    unsigned int i, j;
    for (i = 0; i < time; i++) {
        for (j = 0; j < 6000; j++);
    }
}

int main()
{
    // Configure P0.0, P0.8, and P0.11 as output pins
    IODIR0 |= 0x00000901;  // 0x00000901 = (1<<0) | (1<<8) | (1<<11)

    while (1)
    {
        // Step 1: Turn ON P0.0 and P0.8
        IOSET0 = 0x00000101;  // Set bits 0 and 8
        delay(5000);

        // Step 2: Turn OFF P0.0, P0.8, and P0.11
        IOCLR0 = 0x00000901;
        delay(5000);

        // Step 3: Turn ON P0.0 and P0.11
        IOSET0 = 0x00000801;  // Set bits 0 and 11
        delay(5000);

        // Step 4: Turn OFF all again
        IOCLR0 = 0x00000901;
        delay(5000);
    }
}
