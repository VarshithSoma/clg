package problemThree;

import java.util.Scanner;

class resistor{
    double resistance;
    void giveData(double resistance){
        this.resistance=resistance;
    }
    double displayData(){
        return resistance;
    }
}
class SeriesCircuit extends resistor{
    public static resistor calculateSeriesresistance(resistor resistor1,resistor resistor2){
        resistor result=new resistor();
        result.resistance=resistor1.resistance+resistor2.resistance;
        return result;
    }
}
class ParallelCircuit extends resistor{
    public static resistor calculateParallelresistance(resistor resistor1,resistor resistor2){
        resistor result=new resistor();
        result.resistance=(resistor1.resistance*resistor2.resistance)/(resistor1.resistance+resistor2.resistance);
        return result;
    }
}
public class ResistorExecuteA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter resistance value for resistor-1 : ");
        double resistance1=input.nextDouble();
        System.out.println("Enter resistance value for resistor-2 : ");
        double resistance2=input.nextDouble();
        resistor r1=new resistor();
        resistor r2=new resistor();
        r1.giveData(resistance1);
        r2.giveData(resistance2);
        System.out.println("Resistor-1 resistance : "+r1.displayData());
        System.out.println("Resistor-2 resistance : "+r2.displayData());
        resistor seriesResult=SeriesCircuit.calculateSeriesresistance(r1,r2);
        System.out.println("series resistance : "+seriesResult.displayData());
        resistor ParallelResistance=SeriesCircuit.calculateSeriesresistance(r1,r2);
        System.out.println("series resistance : "+ParallelResistance.displayData());


    }
}
