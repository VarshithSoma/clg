import java.util.Scanner;
class InsufficientException extends Exception{
    double balance,wamount;
    public InsufficientException(String msg){
        super(msg);
    }
    void withdraw(){
        balance=25000;
        System.out.println("Enter withdraw amount : ");
        Scanner input=new Scanner(System.in);
        wamount=input.nextDouble();
        try{
            if(wamount>balance){
                throw new InsufficientException("Insufficient balance in account");
            }else{
                balance-=wamount;
                System.out.println("Transaction Successfully completed");
            }
        }catch(InsufficientException e){
            System.out.println("Caught: "+e.getMessage());
        }
    }
}
class Seventh{
    public static void main(String[] args) {
        InsufficientException obj=new InsufficientException("Insufficient balance");
        obj.withdraw();
    }
}