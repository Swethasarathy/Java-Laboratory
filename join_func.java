public class join_func extends Thread 
{
public void run()
{
	for(int i=1; i<=7; i++)
	{
		try
		{
			Thread.sleep(700);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String args[])
{
	join_func j1= new join_func();
	join_func j2= new join_func();
	join_func j3= new join_func();
	join_func j4= new join_func();
	j1.start();
	try
	{
		j1.join(3500);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	j2.start();
	j3.start();
	j4.start();
}
}
