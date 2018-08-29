public class sleep_func extends Thread
{
	public void run()
	{
		for(int i=1; i<8; i++)
		{
			try
			{
				Thread.sleep(750);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		sleep_func s1 =  new sleep_func();
		sleep_func s2 =  new sleep_func();
		s1.start();
		s2.start();
	}
}
