public class priority_thread extends Thread 
{
public void run()
{
	System.out.print("\nThe current running thread name is : " + (Thread.currentThread().getName()));
	System.out.print("\nThe current running thread priority is : " + (Thread.currentThread().getPriority()));
}
public static void main(String args[])
{
	priority_thread p1 = new priority_thread();
	priority_thread p2 = new priority_thread();
	priority_thread p3 = new priority_thread();
	p1.setPriority(Thread.MIN_PRIORITY);
	p2.setPriority(Thread.MAX_PRIORITY);
	p3.setPriority(Thread.NORM_PRIORITY);
	p1.start();
	p2.start();
	p3.start();
}
}
