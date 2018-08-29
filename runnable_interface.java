public class runnable_interface implements Runnable 
{
public void run()
{
	System.out.println("RegNO : 55");
	System.out.println("Name : Swetha");
}
public static void main(String args[])
{
	runnable_interface r1 = new runnable_interface();
	Thread t = new Thread(r1);
	t.start();
}
}
