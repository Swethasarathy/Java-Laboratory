public class multi_catch 
{
public static void main(String args[])
{
	System.out.println("Java program with multiple catch block");
	try
	{
		int arr[] = new int[7];
		arr[7] = 30/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index not valid");
	}
	catch(Exception e)
	{
		System.out.println("Task is commpleted");
	}
}
}
