import javax.swing.*;
import java.awt.event.*;
public class radio_event extends JFrame implements ActionListener 
{
JRadioButton r1, r2, r3;
JButton b;
radio_event()
{
	r1 = new JRadioButton("Male");
	r1.setBounds(100, 50, 100, 30);
	r2 = new JRadioButton("Female");
	r2.setBounds(100, 100, 100, 30);
	r3 = new JRadioButton("Transgender");
	r3.setBounds(100, 150, 100, 30);
	ButtonGroup bg = new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	b = new JButton("Submit");
	b.setBounds(100, 200, 100, 50);
	b.addActionListener(this);
	add(r1);
	add(r2);
	add(r3);
	add(b);
	setSize(300, 300);
	setLayout(null);
	setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, "You are Male");
	}
	if(r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, "You are Female");
	}
	if(r3.isSelected())
	{
		JOptionPane.showMessageDialog(this, "You are Transgender");
	}
}
public static void main(String args[])
{
	new radio_event();
}
}
