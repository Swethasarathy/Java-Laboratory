import javax.swing.*;
public class radio 
{
JFrame f;
radio()
{
	f = new JFrame();
	JRadioButton r1 = new JRadioButton("Male");
	JRadioButton r2 = new JRadioButton("Female");
	JRadioButton r3 = new JRadioButton("Transgender");
	r1.setBounds(90, 100, 110, 70);
	r2.setBounds(90, 150, 110, 70);
	r3.setBounds(90, 200, 110, 70);
	ButtonGroup b = new ButtonGroup();
	b.add(r1);
	b.add(r2);
	b.add(r3);
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.setSize(300, 300);
	f.setLayout(null);
	f.setVisible(true);
}
public static void main(String args[])
{
	new radio();
}
}
