public class daemon_thread extends Thread
{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("The currently working thread is a Daemon Thread");
	}
	else
	{
		System.out.println("The currently working thread is a User Thread");
	}
}
public static void main(String args[])
{
	daemon_thread d1=  new daemon_thread();
	daemon_thread d2=  new daemon_thread();
	daemon_thread d3=  new daemon_thread();
	daemon_thread d4=  new daemon_thread();
	d3.setDaemon(true);
	d1.start();
	d2.start();
	d3.start();
	d4.start();
}
}
