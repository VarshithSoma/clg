import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
    RadioButtonDemo() {
        JRadioButton r1 = new JRadioButton("Option 1");
        JRadioButton r2 = new JRadioButton("Option 2");
        JRadioButton r3 = new JRadioButton("Option 3");
        JRadioButton r4 = new JRadioButton("Option 4");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);


        add(r1);
        add(r2);
        add(r3);
        add(r4);

        setSize(300, 300 );
        setVisible(true);
    }

    public static void main(String[] args) {

            RadioButtonDemo obj=new RadioButtonDemo();
           obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
