package problemThree;

import java.util.Scanner;

class Resistor{
    double resistance;
    void giveData(double resistance){
        this.resistance=resistance;
    }
    double displayData(){
        return resistance;
    }
}
class seriesCircuit extends Resistor{
    static Resistor CalculateSeriesResistance(Resistor[] resistors){
        Resistor result=new Resistor();
        double totalResistance=0.0;
        for (int i = 0; i < resistors.length; i++) {
            totalResistance+=resistors[i].resistance;
        }
        result.resistance=totalResistance;
        return result;
    }
}
class parallelCircuit extends Resistor{
    static Resistor CalculateParallelResistance(Resistor[] resistors){
        Resistor result=new Resistor();
        double totalResistance=0.0;
        for (int i = 0; i < resistors.length; i++) {
            totalResistance+=1.0/resistors[i].resistance;
        }
        result.resistance=1.0/totalResistance;
        return result;
    }
}
public class resistorexecuteB {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of resistors : ");
        int numResistors=input.nextInt();

        Resistor[] resistors = new Resistor[numResistors];

        if(numResistors>0){
            for (int i = 0; i < numResistors; i++) {
                System.out.println("Enter resistance value for resistor: ");
                double resistanceValue=input.nextDouble();
                resistors[i]= new Resistor();
                resistors[i].giveData(resistanceValue);
            }
            System.out.println("Resistor values : ");
            for (int i = 0; i < resistors.length; i++) {
                System.out.println("Resistor-" + (i + 1) + ":" + resistors[i].displayData());
            }
            Resistor seriesResult = seriesCircuit.CalculateSeriesResistance(resistors);
            System.out.println("Series Resistance:" + seriesResult.displayData());

            Resistor parallelResult = parallelCircuit.CalculateParallelResistance(resistors);
            System.out.println("Parallel Resistance:" + parallelResult.displayData());
        }
        else
        {
            System.out.println("Please Enter atleast 1 Resistor");

        }
    }
}
