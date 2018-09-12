import javax.swing.*;
public class progress extends JFrame 
{
JProgressBar p;
int i=0, no=0;
progress()
{
	p = new JProgressBar(0, 2000);
	p.setBounds(40, 40, 200, 30);
	p.setValue(0);
	p.setStringPainted(true);
	add(p);
	setSize(400, 400);
	setLayout(null);
}
public void iterate()
{
	while(i<=2000)
	{
		p.setValue(i);
		i = i+20;
		try
		{
			Thread.sleep(150);
		}
		catch(Exception e)
		{
			
		}
	}
}
public static void main(String[] args)
{
	progress ch = new progress();
	ch.setVisible(true);
	ch.iterate();
}
}
