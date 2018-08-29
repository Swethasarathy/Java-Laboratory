public class threadcls extends Thread 
{
public void run()
{
	System.out.println("The bike is running with a speed of 80kmph");
}
public static void main(String args[])
{
	threadcls t1= new threadcls();
	t1.start();
}
}
