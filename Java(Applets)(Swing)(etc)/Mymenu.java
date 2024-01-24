import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mymenu extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu file,edit,font;
JMenuItem op,sa,cl,cp,pt,f1,f2;
JCheckBoxMenuItem pr;

Mymenu()
{
Container c=getContentPane();
c.setLayout(new BorderLayout());
mb=new JMenuBar(); //create a menubar.

c.add("North",mb); //add menubar to container.
file = new JMenu("File");
edit=new JMenu("Edit");
mb.add(file);
mb.add(edit);

//Create Menu Items.
op=new JMenuItem("Open");
sa=new JMenuItem("Save");
cp=new JMenuItem("Copy");
pt=new JMenuItem("Paste");
cl=new JMenuItem("Close");

file.add(op);
file.add(sa);
file.add(cp);
file.add(pt);
file.add(cl);

//Make close disabled
cl.setEnabled(false);//for enable type as true.

//create a Print Checkbox and add it to File Menu.
pr=new JCheckBoxMenuItem("Print");
file.add(pr);

file.addSeparator();//to add a separator(horizontal line) to file menu.

font=new JMenu("Font");
file.add(font);

f1=new JMenuItem("Arial");
f2=new JMenuItem("Times New Roman");

font.add(f1);
font.add(f2);

op.addActionListener(this);
sa.addActionListener(this);
cp.addActionListener(this);
pt.addActionListener(this);
cl.addActionListener(this);

pr.addActionListener(this);

f1.addActionListener(this);
f2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(op.isArmed())
System.out.println("Open is selected");

if(sa.isArmed())
System.out.println("Save is selected");

if(cp.isArmed())
System.out.println("Copy is selected");

if(pt.isArmed())
System.out.println("Paste is selected");

if(cl.isArmed())
System.out.println("Close is selected");

if(pr.getModel().isSelected())
System.out.println("Printing is ON...");
else
System.out.println("Printing is OFF..");

if(f1.isArmed())
System.out.println("Arial font is selected");

if(f2.isArmed())
System.out.println("Times New Roman is selected");

}

public static void main(String args[])
{
Mymenu obj=new Mymenu();//create a frame.
obj.setTitle("IOT JMenu..");
obj.setSize(500,400);
obj.setVisible(true);

obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//For closing Window in JFrame.
}
}