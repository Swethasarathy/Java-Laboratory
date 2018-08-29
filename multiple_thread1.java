public class multiple_thread1 extends Thread 
{
public void run()
{
	System.out.println("This program illustrates that single task is performed by multiple threads");
}
public static void main(String args[])
{
	multiple_thread1 m1 = new multiple_thread1();
	multiple_thread1 m2 = new multiple_thread1();
	multiple_thread1 m3 = new multiple_thread1();
	m1.start();
	m2.start();
	m3.start();
}
}
