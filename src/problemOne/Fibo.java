package problemOne;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of t");
        int t= input.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(" 0 1");
        for (int i = 0; i < t-2; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
