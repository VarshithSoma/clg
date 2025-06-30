#include <lpc214x.h>
#include <stdint.h>

// Delay function to create ~1 millisecond delay assuming Cclk = 60 MHz
void delay_ms(uint16_t j)
{
    uint16_t x, i;
    for (i = 0; i < j; i++) {
        for (x = 0; x < 6000; x++); // Approx 1 ms delay
    }
}

int main(void)
{
    uint16_t sine_wave[42] = {
        512, 591, 665, 742, 808, 873, 926, 968, 998, 1017, 1023,
        1017, 998, 968, 926, 873, 808, 742, 665, 591, 512,
        436, 359, 282, 216, 211, 151, 97, 55, 25, 6, 0, 6,
        25, 55, 97, 151, 211, 216, 282, 359, 436
    };

    uint16_t value;
    uint8_t i = 0;

    PINSEL1 = 0x00080000; // Set P0.25 as DAC output (DACOUT)

    while (1)
    {
        while (i != 42)
        {
            value = sine_wave[i];
            DACR = (1 << 16) | (value << 6); // Send value to DAC (bias = 1)
            delay_ms(1); // 1 ms delay between samples
            i++;
        }
        i = 0; // Restart waveform from beginning
    }
}
