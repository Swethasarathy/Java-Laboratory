public class final_class 
{
	void run()
	{
	System.out.println("This is the base class");
	}
}
final class bike extends final_class
{
	void der_run()
	{
		System.out.println("This is the final class derived from final_class");
	}
	public static void main(String args[])
	{
		bike b = new bike();
		b.run();
		b.der_run();
	}
}