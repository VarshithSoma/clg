#include <lpc214x.h>

// Delay function: ~1ms per loop when Cclk = 60 MHz
void delay(unsigned int time)
{
    unsigned int i, j;
    for (i = 0; i < time; i++) {
        for (j = 0; j < 6000; j++); // Busy wait
    }
}

int main()
{
    IODIR0 |= 0x00000901; // Set P0.0, P0.8, and P0.11 as output

    while (1)
    {
        // Set P0.0 and P0.8 (binary 0000 0000 0000 0000 0000 1000 0000 0001)
        IOSET0 = 0x00000101;
        delay(5000);

        // Clear P0.0, P0.8, and P0.11
        IOCLR0 = 0x00000901;
        delay(5000);

        // Set P0.0 and P0.11
        IOSET0 = 0x00000801;
        delay(5000);

        // Clear P0.0, P0.8, and P0.11 again
        IOCLR0 = 0x00000901;
        delay(5000);
    }
}
