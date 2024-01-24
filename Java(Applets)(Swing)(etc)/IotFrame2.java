import java.awt.*;    
import java.awt.event.*;
  
// class directly creates instance of Frame class  
class IotFrame2 
{    
  
public static void main(String args[]) {    
      // creating a Frame  
      Frame f = new Frame("IOT Students information");  
     //Create layout of each component 
     f.setLayout(new FlowLayout()); 
      // creating a Label  
      Label l = new Label("Students Roll ");   
  
      // creating a Button  
      Button b = new Button("Submit");  
  b.setForeground(Color.yellow);
      // creating a TextField  
      TextField t = new TextField(10);  
  
      // setting position of above components in the frame  
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);  
  
      // adding components into frame    
      f.add(l);  
      f.add(t);  
      f.add(b);  
  
      // frame size 300 width and 300 height    
      f.setSize(700,500);  
f.setBackground(Color.green);
  
      // setting the title of frame  
     // f.setTitle("Students info:  ");   
  
        // setting visibility of frame  
         f.addWindowListener(new CloseFrame());
      f.setVisible(true);  
     
}    

   
}