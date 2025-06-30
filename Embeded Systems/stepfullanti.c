Full step rotation (Anti-clock wise)
/*
Stepper motor interfacing with LPC2148(ARM7)

*/
#include lpc214x.h;
#include stdint.h;
void delay_ms(uint16_t j){
    uint16_t x,i;
    for(i=0;i<j;i++){
        for(x=0;x<6000; x++); /* loop to generate 1 milisecond delay with Cclk = 60MHz */
    }
}
int main (void){
    PINSEL0=0x00000000;
    IO0DIR = (IO0DIR | 0x0000000F); /* Configure P0.0-P0.3 as output(used for controlling stepper motor) */
    while(1){
        IO0PIN = ( (IO0PIN | 0x00000001) & 0xFFFFFFF1 );
        delay_ms(100);
        IO0PIN = ( (IO0PIN | 0x00000002) & 0xFFFFFFF2 );
        delay_ms(100);
        IO0PIN = ( (IO0PIN | 0x00000004) & 0xFFFFFFF4 );
        delay_ms(100);
        IO0PIN = ( (IO0PIN | 0x00000008) & 0xFFFFFFF8 );
        delay_ms(100);
    }
}