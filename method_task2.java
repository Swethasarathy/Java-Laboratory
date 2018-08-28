public class method_task2 extends Thread 
{
public void run()
{
	System.out.println("Task one");
}
}
class sample extends Thread
{
	public void run()
	{
		System.out.println("Task two");
	}
}
class result
{
	public static void main(String args[])
	{
		method_task2 m1 = new method_task2();
		sample s1 = new sample();
		m1.start();
		s1.start();
	}
}
