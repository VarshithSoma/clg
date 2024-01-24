import javax.swing.*;
public class TextFieldDemo extends JFrame{
    TextFieldDemo(){
        JTextField t=new JTextField("welcome");
        t.setBounds(50,100,70,30);
        add(t);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
          TextFieldDemo obj=  new TextFieldDemo();
          obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}