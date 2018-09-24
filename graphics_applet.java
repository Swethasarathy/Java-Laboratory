import java.applet.Applet;
import java.awt.*;
public class graphics_applet extends Applet 
{
public void paint(Graphics g)
{
	g.setColor(Color.blue);
	g.drawString("Graphics in Applet", 100, 100);
	g.drawLine(20,30,20,200);
	g.drawRect(170, 150, 30,30);
	g.fillRect(170,150, 30, 30);
	g.drawOval(70, 250, 30, 30);
	g.setColor(Color.red);
	g.fillOval(170,  250,  30, 30);
	g.drawArc(90, 200, 30, 30, 30, 270);
	g.fillArc(270, 200, 30, 30, 0, 180);
}
}
