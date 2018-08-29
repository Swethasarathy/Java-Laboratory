public class multiple_thread2 implements Runnable
{
public void run()
{
	System.out.println("Performing single task by multiple threads");
}
public static void main(String args[])
{
	Thread m1 = new Thread(new multiple_thread2());
	Thread m2 = new Thread(new multiple_thread2());
	m1.start();
	m2.start();
}
}
