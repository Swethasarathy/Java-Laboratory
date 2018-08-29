public class current_thread extends Thread 
{
public void run()
{
	System.out.print("\nThe name of the current thread is : " +(Thread.currentThread().getName()));
}
public static void main(String args[])
{
	current_thread t1 = new current_thread();
	current_thread t2 = new current_thread();
	current_thread t3 = new current_thread();
	t1.start();
	t2.start();
	t3.start();
}
}

