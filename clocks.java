import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class clocks implements Runnable 
{
JFrame f;
Thread t1 = null;
int hour = 0, minute = 0, second = 0;
String time = "";
JButton b;
clocks()
{
	f = new JFrame();
	t1 = new Thread(this);
	t1.start();
	
	b = new JButton();
	b.setBounds(100,  100, 100, 50);
	f.add(b);
	f.setSize(300, 400);
	f.setLayout(null);
	f.setVisible(true);
}
public void run()
{
	try
	{
		while(true)
		{
			Calendar cal = Calendar.getInstance();
			hour = cal.get(Calendar.HOUR_OF_DAY);
			if(hour > 12)hour -= 12;
			minute = cal.get(Calendar.MINUTE);
			second = cal.get(Calendar.SECOND);
			SimpleDateFormat formatter = new SimpleDateFormat("HH:MM:SS");
			Date date = cal.getTime();
			time = formatter.format(date);
			printTime();
			t1.sleep(1000);
		}
	}
	catch(Exception e)
	{
		
	}
}
public void printTime()
{
	b.setText(time);
}
public static void main(String[] args)
{
	new clocks();
}
}
