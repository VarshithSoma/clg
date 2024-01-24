import java.awt.*;
import java.awt.event.*;
class Myclass extends AdapterClass
{

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}
class DemoApplet extends Frame
{
	public static void main(String[] args)
	{
		MyFrame f = new MyFrame();
		f.setTitle("My AWT Frame");
		f.setSize(400,400);
		f.setVisible(true);
		Label l=new Label("Hello there");
		add(l);
		f.addWindowListener(new Myclass());
	}
}