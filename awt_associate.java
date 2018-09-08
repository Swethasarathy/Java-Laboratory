import java.awt.*;
public class awt_associate 
{
awt_associate()
{
	Frame f= new Frame();
	Button b = new Button("Click here");
	b.setBounds(30, 50, 80, 30);
	f.add(b);
	f.setSize(300, 300);
	f.setLayout(null);
	f.setVisible(true);
}
public static void main(String args[])
{
	awt_associate a= new awt_associate();
}
}
