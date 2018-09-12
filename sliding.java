import javax.swing.*;
public class sliding extends JFrame 
{
public sliding()
{
	JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
	JPanel p = new JPanel();
	p.add(s);
	add(p);
}
public static void main(String[] args)
{
	sliding st = new sliding();
	st.pack();
	st.setVisible(true);
}
}
