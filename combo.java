import javax.swing.*;
public class combo 
{
JFrame f;
combo()
{
	f = new JFrame("Countries List");
	String country[] = {"India", "China", "Japan", "Nepal", "Pakistan", "Hong Kong", "Thailand", "Malaysia", "Singapore"};
	JComboBox c =  new JComboBox(country);
	c.setBounds(60, 60, 100, 30);
	f.add(c);
	f.setLayout(null);
	f.setSize(400,  500);
	f.setVisible(true);
}
public static void main(String[] args)
{
	new combo();
}
}
