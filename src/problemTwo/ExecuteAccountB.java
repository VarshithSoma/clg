package problemTwo;

import java.util.Scanner;

class BankAccountB{
    String name,type;
    int AccountNumber;
    double balance,wbalance;
    Scanner input=new Scanner(System.in);
    static int count=0;
    public BankAccountB(){
        name="abc";
        type="savings";
        AccountNumber=1234567890;
        balance=10000.0;
        count++;
    }
    public BankAccountB(String a,String t,int accno,double bal){
        name=a;
        type=t;
        AccountNumber=accno;
        balance=bal;
        count++;
    }
    void deposit(){
        System.out.println("Enter the amount to deposit: ");
        double bal=input.nextDouble();
        balance=balance+bal;
    }
    void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        wbalance=input.nextDouble();
        balance=balance-wbalance;
    }
    void display(){
        System.out.println("Details :");
        System.out.println("Account name: "+name);
        System.out.println("Account type: "+type);
        System.out.println("Account number: "+AccountNumber);
        System.out.println("Account balance: "+balance);
        System.out.println();
    }
    static void totalNumberOfAccouts(){
        System.out.println("total number of accounts are :"+count);
    }

}
public class ExecuteAccountB {
    public static void main(String[] args) {
        BankAccountB ba1=new BankAccountB();
        BankAccountB ba2=new BankAccountB();
        BankAccountB ba3=new BankAccountB();
        BankAccountB.totalNumberOfAccouts();
    }

}
