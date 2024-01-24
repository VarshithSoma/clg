package problemTwo;

import java.util.Scanner;

class BankAccountG{
    String name;
    String type;
    int accountNumber;
    double balance;
    double wbalance;
    Scanner input =new Scanner(System.in);
    void getAccNo(){
        System.out.println("Account Number is : "+accountNumber);
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    void getAccountBalance(){
        System.out.println("Account Balance is : "+balance);
    }
    void setAccountBalance(double bal){
        this.balance=bal;
    }
    void setName(String name){
        this.name=name;
    }
    void getName(){
        System.out.println("Account Name is : "+ this.name);
    }
    void setType(String type){
        this.type=type;
    }
    void getType(){
        System.out.println("Account type is : "+type);
    }
    public BankAccountG(){
        System.out.println("Enter the Name: ");
        name=input.nextLine();
        System.out.println("Enter the account Number : ");
        accountNumber=input.nextInt();
        System.out.println("Enter the type of account: ");
        input.nextLine();
        type=input.nextLine();
        System.out.println("Enter the balance:");
        balance=input.nextDouble();
    }
    public BankAccountG(String n,String t,int acc,double bl){
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
public class ExecuteAccountG {
    public static void main(String[] args) {

    }
}
