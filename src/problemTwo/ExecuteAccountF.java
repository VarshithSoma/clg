package problemTwo;

import java.util.Scanner;

class BankAccountF{
    String name;

    String type;
    int accountNumber;
    double balance;
    double wbalance;
    Scanner input =new Scanner(System.in);
    public BankAccountF(){
        System.out.println("Enter the Name: ");
        name=input.nextLine();
        System.out.println("Enter the account Number : ");
        accountNumber=input.nextInt();
        System.out.println("Enter the type of account: ");
        input.nextLine();
//        The problem lies in the constructor public BankAccountE() where
//        you use input.nextLine() after input.nextInt(). When you use nextLine()
//        after nextInt(), it can cause issues as nextLine() consumes the newline
//        character left by the nextInt(). To fix this issue, you can add an extra input.nextLine()
//        after input.nextInt() to consume the newline character.
        type=input.nextLine();
        System.out.println("Enter the balance:");
        balance=input.nextDouble();
    }
    public BankAccountF(String n,String t,int acc,double bl){
        name=n;
        type=t;
        accountNumber=acc;
        balance=bl;
    }
    void deposit(){
        double bal;
        System.out.println("enter the amount to deposit: ");
        bal=input.nextDouble();
        balance=balance+bal;
    }
    void deposit(double bal){
        balance=balance+bal;
    }
    void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        wbalance=input.nextDouble();
        if(wbalance<0){
            System.out.println("Enter correct balance: ");
            wbalance= input.nextDouble();
        }
        balance=balance-wbalance;
    }
    void display(){
        System.out.println("Details :");
        System.out.println("Account name: "+name);
        System.out.println("Account type: "+type);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account balance: "+balance);
        System.out.println();
    }
}
public class ExecuteAccountF {
    public static void main(String[] args) {

    }
}
