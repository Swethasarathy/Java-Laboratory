class result
{
	void display(int a)
	{
		synchronized(this)
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
}
class table1 extends Thread
{
	result r;
	table1(result r)
	{
		this.r = r;
	}
	public void run()
	{
		r.display(7);
	}
}
class table2 extends Thread
{
	result r;
	table2(result r)
	{
		this.r = r;
	}
	public void run()
	{
		r.display(300);
	}
}
public class syncblcok 
{
public static void main(String args[])
{
	result r = new result();
	table1 t1=  new table1(r);
	table2 t2=  new table2(r);
	t1.start();
	t2.start();
}
}
