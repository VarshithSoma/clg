import java.util.*;
class InsufficientException extends Exception{
double bal,wbal;
Scanner s=new Scanner(System.in);
public InsufficientException(String msg)
{
super(msg);
}
void withdraw(){
bal=25000.0;
try{
System.out.println("withdrawl amount");
wbal=s.nextDouble();
if(bal<wbal){
throw new InsufficientException("InsufficientException");
}
else{
bal=bal-wbal;
System.out.println("balance="+bal);
}
}
catch(InsufficientException e){
System.out.println("caught:"+e.getMessage());
}}}
class BankEx{
public static void main(String args[]){
InsufficientException ie=new InsufficientException("Insufficient Exception");
ie.withdraw();
}}