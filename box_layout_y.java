import java.awt.*;  
import javax.swing.*;  
public class box_layout_y extends Frame {  
Button buttons[];  
public box_layout_y () 
 {  
   buttons = new Button [5];  
   for (int i = 0;i<5;i++) 
   {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
setSize(400,400);  
setVisible(true);  
}  
public static void main(String args[]){  
box_layout_y b=new box_layout_y();  
}  
}  
