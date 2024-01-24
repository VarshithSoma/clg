import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankingApp extends JFrame implements ActionListener {

    private JTextField nameField, balanceField, depositField, withdrawField;
    private JButton createAccountButton, depositButton, withdrawButton;
    private Account account;

    public BankingApp() {
        super("Banking App");
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Account Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Initial Balance:"));
        balanceField = new JTextField(15);
        add(balanceField);

        createAccountButton = new JButton("Create Account");
        createAccountButton.addActionListener(this);
        add(createAccountButton);

        add(new JLabel("Deposit Amount:"));
        depositField = new JTextField(15);
        add(depositField);

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);
        add(depositButton);

        add(new JLabel("Withdraw Amount:"));
        withdrawField = new JTextField(15);
        add(withdrawField);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);
        add(withdrawButton);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createAccountButton) {
            String name = nameField.getText();
            double balance = Double.parseDouble(balanceField.getText());
            account = new Account(name, balance);
            JOptionPane.showMessageDialog(this, "Account created successfully!");
        } else if (e.getSource() == depositButton) {
            double amount = Double.parseDouble(depositField.getText());
            account.deposit(amount);
            JOptionPane.showMessageDialog(this, "Deposited successfully!");
        } else if (e.getSource() == withdrawButton) {
            double amount = Double.parseDouble(withdrawField.getText());
            if (account.withdraw(amount)) {
                JOptionPane.showMessageDialog(this, "Withdrawal successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {
        new BankingApp();
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
