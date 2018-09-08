import java.awt.*;
public class awt_inherit extends Frame 
{
awt_inherit()
{
	Button b = new Button("Click here");
	b.setBounds(30, 100, 80, 30);
	add(b);
	setSize(300, 300);
	setLayout(null);
	setVisible(true);
}
public static void main(String args[])
{
	awt_inherit a= new awt_inherit();
}
}
