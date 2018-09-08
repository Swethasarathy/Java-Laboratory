import java.awt.*;
import java.awt.event.*;
public class event_handle extends Frame implements ActionListener 
{
TextField t;
event_handle()
{
	t = new TextField();
	t.setBounds(60, 50, 170, 20);
	Button b = new Button("Click here");
	b.setBounds(100, 120, 80, 30);
	b.addActionListener(this);
	add(b);
	add(t);
	setSize(300, 300);
	setLayout(null);
	setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	t.setText("Event Handling within Class");
}
public static void main(String args[])
{
	new event_handle();
}
}
