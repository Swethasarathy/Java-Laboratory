public class jfinally2 
{
public static void main(String args[])
{
	try
	{
		int a = 5/0;
		System.out.println(a);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally block is always executed");
	}
	System.out.println("This java finally program illustrates that exceptions that occurred are not handeled");
}
}
