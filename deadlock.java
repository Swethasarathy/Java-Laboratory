public class deadlock 
{
public static void main(String args[])
{
	final String str1 = "swetha parthasarathy";
	final String str2 = "sheela parthasarathy";
	Thread t1 = new Thread()
			{
		public void run()
		{
			synchronized(str1)
			{
				System.out.println("Thread 1: locked resource 1");
				try
				{
					Thread.sleep(300);
				}
				catch(Exception e)
				{
				}
				synchronized(str2)
				{
					System.out.println("Thread 2 : locked resource 2");
				}
			}
		}
			};
		Thread t2 = new Thread()
				{
			public void run()
			{
				synchronized(str2)

			{
					System.out.println("Thread 2 : locked resource 2");
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(str1)
					{
						System.out.println("Thread 2 : locked resource 1");
					}
			}
				
			}
			};
				t1.start();
				t2.start();
}
}
