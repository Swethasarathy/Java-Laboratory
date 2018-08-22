public class nested_try 
{
public static void main(String args[])
{
	System.out.println("This program illustrates nested catch block");
	try
	{
		try
		{
			System.out.println("Going to perform division");
			int a = 50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			System.out.println("Going to initialize the array");
			int arr[] = new int[7];
			arr[7] = 29;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Other statements");
	}
	catch(Exception e)
	{
		System.out.println("All exceptions Handeled");
	}
}
}
