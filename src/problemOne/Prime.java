import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Test obj=new Test();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int val=input.nextInt();
        obj.check(val);
    }
}
class Test{
    void check(int num){
        System.out.println("Prime numbers to "+num+" are:");
        int count=0;
        for (int i = 1; i <=num ; i++) {
            count=0;
            for(int j=1;j<=i;j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
