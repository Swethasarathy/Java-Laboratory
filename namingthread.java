public class namingthread extends Thread 
{
public void run()
{
	System.out.println("Thread is running");
}
public static void main(String args[])
{
	namingthread t1 = new namingthread();
	namingthread t2 = new namingthread();
	namingthread t3 = new namingthread();
	System.out.print("The name of thread t1 is : " + t1.getName());
	System.out.print("\nThe name of thread t2 is : " + t2.getName());
	System.out.print("\nThe name of thread t3 is : " + t3.getName());
	t1.start();
	t2.start();
	t3.start();
	t3.setName("Swetha");
	System.out.println("Renaming the thread");
	System.out.println("After renaming, the new name of thread t3 is : " + t3.getName());
}
}
