public class shut_hook extends Thread 
{
public void run()
{
	System.out.println("The shut down hook process has been completed");
}
}
class testing
{
	public static void main(String args[]) throws Exception
	{
		Runtime obj =Runtime.getRuntime();
		obj.addShutdownHook(new shut_hook());
		System.out.println("Now the Main Function is sleeping");
		System.out.println("Press Ctrl + C to exit");
		try
		{
			Thread.sleep(4500);
		}
		catch(Exception e)
		{
			
		}
	}
}
