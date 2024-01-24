import java.awt.*;
import java.awt.event.*;
public class IotFrame extends Frame{
    public static void main(String[] args) {
        IotFrame f=new IotFrame();
       
    }
    IotFrame(){
         setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
