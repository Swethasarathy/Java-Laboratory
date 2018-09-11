import java.awt.*;
import javax.swing.JFrame;
public class displaygraphics extends Canvas 
{
public void paint(Graphics g)
{
	g.drawString("SWING PROGRAM", 50, 50);
	setBackground(Color.WHITE);
	g.fillRect(170, 30, 100, 80);
	g.drawOval(30, 130, 50, 60);
	setForeground(Color.BLUE);
	g.fillOval(170,  130,  50, 60);
	g.drawArc(40,  210,  50,  60,  100,  70);
	g.fillArc(30,  130,  40,  50,  180,  40);
	
}
public static void main(String[] args)
{
displaygraphics d = new displaygraphics();
JFrame f = new JFrame();
f.add(d);
f.setSize(400, 400);
//f.setLayout(null);
f.setVisible(true);
}
}
