package problemTwo;

import java.util.Scanner;

class BankAccount{
    String name;
    String type;
    int accountNumber;
    double balance;
    double wbalance;
    Scanner input =new Scanner(System.in);
    public BankAccount(){
        name="abc";
        accountNumber=1234567890;
        type="savings";
        balance=10000.0;
    }
    public BankAccount(String n,String t,int acc,double bl){
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

public class ExecuteAccountA {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount();
        ba1.display();
        ba1.deposit();
        ba1.withdraw();
        ba1.display();
        BankAccount ba2=new BankAccount("varshith","Overseas Indian",223116904,50000);
        ba2.display();
    }

}
