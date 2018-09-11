import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class choose_color extends JFrame implements ActionListener 
{
JButton b;
Container c;
choose_color()
{
	c = getContentPane();
	c.setLayout(new FlowLayout());
	b = new JButton("CHOOSE THE COLORS");
	b.addActionListener(this);
	c.add(b);
}
public void actionPerformed(ActionEvent e)
{
	Color initial = Color.BLUE;
	Color color = JColorChooser.showDialog(this, "Select a color", initial);
	c.setBackground(color);
}
public static void main(String[] args)
{
	choose_color ch  = new choose_color();
	ch.setSize(400, 400);
	ch.setVisible(true);
	ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
