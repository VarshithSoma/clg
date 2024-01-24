package problemTwo;

import java.util.Scanner;

class BankAccountD{
    String name;
    String type;
    int accountNumber;
    double balance;
    double wbalance;
    Scanner input =new Scanner(System.in);
    public BankAccountD(){
        name="abc";
        accountNumber=1234567890;
        type="savings";
        balance=10000.0;
    }
    public BankAccountD(String name,String type,int accountNumber,double balance){
        this.name=name;
        this.type=type;
        this.accountNumber=accountNumber;
        this.balance=balance;
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
public class ExecuteAccountD {
    public static void main(String[] args) {
        BankAccountD ba1=new BankAccountD();
        BankAccountD ba2=new BankAccountD("varshith","Overseas Indian",223116904,50000);
    }

}
