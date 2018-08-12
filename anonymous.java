public class anonymous 
{
void factorial(int m)
{
	int factorial = 1;
	for(int i=1; i<=m;i++)
	{
		factorial = factorial * i;
	}
	System.out.println("Factorial of " + m + " is " + factorial);
}
public static void main(String args[])
{
	new anonymous().factorial(7);
}
}
