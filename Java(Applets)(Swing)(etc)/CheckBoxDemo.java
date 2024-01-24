import javax.swing.*;
public class CheckBoxDemo extends JFrame{
    CheckBoxDemo(){
        JCheckBox j=new JCheckBox("books",true);
        add(j);
        setSize(500,500);
        setVisible(true);
        j.setBounds(100,200,200,100);
    }
    public static void main(String[] args) {
        CheckBoxDemo cb=new CheckBoxDemo();
        cb.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}