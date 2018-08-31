class table 
{
synchronized static void display(int a)
{
	for(int i=1;i<=12;i++)
	{
		System.out.println(a*i);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		}
	}
}
}
class stud1 extends Thread
{
	public void run()
	{
		table.display(5);
	}
}
class stud2 extends Thread
{
	public void run()
	{
		table.display(15);
	}
}
class stud3 extends Thread
{
	public void run()
	{
		table.display(25);
	}
}
class stud4 extends Thread
{
	public void run()
	{
		table.display(35);
	}
}
class stud5 extends Thread
{
	public void run()
	{
		table.display(45);
	}
}
public class static_sync
{
	public static void 
	main(String t[])
	{
		stud1 s1=  new stud1();
		stud2 s2=  new stud2();
		stud3 s3=  new stud3();
		stud4 s4=  new stud4();
		stud5 s5=  new stud5();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}
}