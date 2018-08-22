public class jfinally3 
{
public static void main(String args[])
{
	try
	{
		int a = 50/0;
		System.out.println(a);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally block is always executed");
	}
	System.out.println("This java finally program illustrates that exceptions that occurred are handeled");
}
}
