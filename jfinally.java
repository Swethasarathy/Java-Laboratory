public class jfinally 
{
public static void main(String args[])
{
	try
	{
		int a = 100/25;
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
}
}

