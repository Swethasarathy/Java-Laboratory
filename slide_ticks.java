import javax.swing.*;
public class slide_ticks extends JFrame 
{
public slide_ticks()
{
	JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
	s.setMinorTickSpacing(1);
	s.setMajorTickSpacing(15);
	s.setPaintTicks(true);
	s.setPaintLabels(true);
	JPanel p = new JPanel();
	p.add(s);
	add(p);
}
public static void main(String s[])
{
	slide_ticks ch = new slide_ticks();
	ch.pack();
	ch.setVisible(true);
}
}
