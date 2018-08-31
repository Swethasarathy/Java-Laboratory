class testing
{
void print(int a)
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
 class threading extends Thread
{
	testing t1;
	threading(testing t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.print(7);
	}
}
class threading2 extends Thread
{
	testing t1;
	threading2(testing t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.print(150);
	}
}
public class sync
{
	public static void main(String args[])
	{
		testing obj = new testing();
		threading t1 = new threading(obj);
		threading2 t2 = new threading2(obj);
		t1.start();
		t2.start();
	}
}
