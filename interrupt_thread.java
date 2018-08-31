class tested extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("This is the code for interruted thread");
			}
			else
			{
				System.out.println("This is the code for normal thread");
			}
		}
	}
}
public class interrupt_thread 
{
public static void main(String args[])
{
	tested t1 = new tested();
	tested t2 = new tested();
	tested t3 = new tested();
	t1.start();
	t2.start();
	t2.interrupt();
	t3.start();
}
}
