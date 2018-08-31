class test
{
	synchronized void display(int a)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(a*i);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
}
class thread1 extends Thread
{
	test t1;
	thread1(test t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.display(7);
	}
}
class thread2 extends Thread
{
	test t1;
	thread2(test t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.display(300);
	}
}
public class sync_method 
{
public static void main(String args[])
{
	test obj = new test();
	thread1 t1 = new thread1(obj);
	thread2 t2 = new thread2(obj);
	t1.start();
	t2.start();
}
}
