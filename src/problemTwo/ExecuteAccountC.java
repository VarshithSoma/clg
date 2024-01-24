package problemTwo;

public class ExecuteAccountC {
    public static void main(String[] args) {
        BankAccount[] accounts=new BankAccount[3];
        accounts[0] =new BankAccount("varshith","Overseas Indian",223116904,50000);
        accounts[1]=new BankAccount();
        accounts[2]=new BankAccount("Bunny","Fixed deposit",2023101930,000.00);
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].display();
        }
    }


}
