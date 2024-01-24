import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AdditionFrame extends Frame implements ActionListener{
    JButton b1,b2;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    AdditionFrame(){
        super("Addition and subtraction of two numbers ");
        setLayout(null);
        setVisible(true);
        setSize(500,400);
        l1=new Label("Enter the first number :");
        l2=new Label("enter the second number :");
        l3=new Label("result : ");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b1=new JButton("Add");
        b2=new JButton("Sub");
        l1.setBounds(100,50,150,20);
        add(l1);
        t1.setBounds(270,50,50,20);
        add(t1);
        l2.setBounds(100,80,170,20);
        add(l2);
        t2.setBounds(270,80,50,20);
        add(t2);
        l3.setBounds(100,120,120,20);
        add(l3);
        t3.setBounds(230,120,50,20);
        add(t3);
        b1.setBounds(100,150,50,50);
        b2.setBounds(150,150,50,50);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        float a,b,c;
        if(ae.getSource()==b1){
            a=Float.parseFloat(t1.getText().trim());
            b=Float.parseFloat(t2.getText().trim());
            c=a+b;
            t3.setText(Float.toString(c));
        }
        if(ae.getSource()==b2){
            a=Float.parseFloat(t1.getText().trim());
            b=Float.parseFloat(t2.getText().trim());
            c=a-b;
            t3.setText(Float.toString(c));
        }
    }
    public static void main(String[] args) {
        AdditionFrame obj=new AdditionFrame();
    }

}