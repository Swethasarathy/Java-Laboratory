public class task_thread2 extends Thread 
{
public void run()
{
	System.out.println("Task One");
}
}
class sample extends Thread
{
	public void run()
	{
		System.out.println("Task Two");
	}
}
class result
{
	public static void main(String args[])
	{
		task_thread2 m1 =  new task_thread2();
		sample m2 = new sample();
		m1.start();
		m2.start();
		
	}
}
