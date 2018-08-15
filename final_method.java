public class final_method 
{
 void run()
{
	System.out.println("This is the method in base class");
}
}
class car extends final_method
{
	final void run()
	{
		System.out.println("This is the final method in inherited class");
	}
	public static void main(String args[])
	{
		car c = new car();
		c.run();
	}
}
