import java.util.Scanner;
class PrintEven implements Runnable{
    int max;
    PrintEven(int max){
        this.max=max;
    }
    public void run(){
        for(int i=0;i<max;i+=2){
            System.out.println("Even : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class PrintOdd implements Runnable{
    int max;
    PrintOdd(int max){
        this.max=max;
    }
    public void run(){
        for(int i=1;i<max;i+=2){
            System.out.println("Odd : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadEvenOdd extends Thread{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int maxe=input.nextInt();
        int maxo=input.nextInt();
        Thread even=new Thread(new PrintEven(maxe));
        Thread odd=new Thread(new PrintOdd(maxo));
        even.start();
        odd.start();
    }

}
