import javax.swing.*;
public class tables 
{
JFrame f;
tables()
{
	f = new JFrame();
	String details[][] = { { "55", "Swetha", "IT"},{"57", "Yoga Sri", "CSE"}, {"58", "Meenakshi", "ECE"}, {"59", "Saranya", "EEE"},{"60", "Krishika", "Civil"}};
	String column[] = {"ROLL NO", "NAME", "DEPARTMENT"};
	JTable t = new JTable(details,column);
	t.setBounds(30, 40, 200, 300);
	JScrollPane s = new JScrollPane(t);
	f.add(s);
	f.setSize(300, 400);
	//f.setLayout(null);
	f.setVisible(true);
}
public static void main(String args[])
{
	new tables();
}
}
