import java.awt.*;
import javax.swing.JFrame;
public class display_img extends Canvas 
{
public void paint(Graphics g)
{
	Toolkit t = Toolkit.getDefaultToolkit();
	Image i = t.getImage("B612.jpg");
	g.drawImage(i, 120, 100,  this);
}
public static void main(String[] args)
{
	display_img d = new display_img();
	JFrame f = new JFrame();
	f.add(d);
	f.setSize(400, 400);
	f.setVisible(true);
}
}
