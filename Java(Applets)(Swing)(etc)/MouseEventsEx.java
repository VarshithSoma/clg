import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class MouseEventEx extends JFrame implements MouseListener,MouseMotionListener{
	JTextArea ta;
	Container c;
	String str;
	MouseEventEx(){
		c=getContentPane();
		ta=new JTextArea("Click On Mouse");
		str="";
		c.add(ta);
		c.setSize(500,500);
		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me){
		int i=me.getButton();
		switch (i) {
			case 1:
				str+="Left click";
				break;
			case 2: 
				str+="middle click";
				break;
			case 3:
				str+="right click";
				break;
			default:
				break;
		}
		this.display();
	}
	public void mousePressed(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse pressed at "+x+y;
		this.display();
	}
	public void mouseReleased(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse pressed at "+x+y;
		this.display();
	}
	public void mouseExited(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse pressed at "+x+y;
		this.display();
	}
		public void mouseEntered(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse pressed at "+x+y;
		this.display();
	}
	public void mouseDragged(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse dragged at "+x+y;
		this.display();
	}
	public void mouseMoved(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		str+="mouse moved at "+x+y;
		this.display();
	}
	public void display(){
		ta.setText(str);
		str="";
	}
	public static void main(String[] args) {
		MouseEventEx obj=new MouseEventEx();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}