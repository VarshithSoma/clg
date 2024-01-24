import javax.swing.*;
public class PasswordField extends JFrame {
    PasswordField(){
        setTitle("hey there");
        JPasswordField p=new JPasswordField();
        setSize(500,500);
        p.setBounds(100,200,200,100);
        setLayout(null);
        setVisible(true);
        add(p);
    }
    public static void main(String[] args) {
        PasswordField pf=new PasswordField();
        pf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}