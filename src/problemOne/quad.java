package problemOne;

import java.util.Scanner;

public class quad {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double d=b*b-4*a*c;
        if(d<0){
            System.out.println("expression has imaginary roots");
        }
        if(d==0){
            System.out.println("real and equal roots r1:");
            double r=-b/(2*a);
            System.out.println(r);
        }
        if(d>0) {
            System.out.println("real and distict r1:");
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(r1);
            double r2=(-b - Math.sqrt(d)) / (2 * a);
            System.out.println("r2: "+r2);
            }
        }
    }

