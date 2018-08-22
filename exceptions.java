public class exceptions 
{
public static void main(String args[])
{
	System.out.println("Sample java program to illustrate Exception Handling");
	try
	{
		int a = 529/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
