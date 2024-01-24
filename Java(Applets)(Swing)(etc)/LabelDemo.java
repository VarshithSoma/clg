import javax.swing.*;
public class LabelDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Label Example");
        JLabel l=new JLabel("Welcome");
        l.setBounds(30,70,200,150);
        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}