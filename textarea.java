import java.awt.Color;
import javax.swing.*;
public class textarea 
{
JTextArea area;
JFrame f;
textarea()
{
	f = new JFrame();
	area = new JTextArea(300, 300);
	area.setBounds(10, 30, 300, 300);
	area.setBackground(Color.yellow);
	area.setForeground(Color.red);
	
	f.add(area);
	f.setSize(400, 400);
	f.setLayout(null);
	f.setVisible(true);
}
public static void main(String[] args)
{
	new textarea();
}
}
