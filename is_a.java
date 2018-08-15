public class is_a 
{
float salary = 50000;
}
class employee extends is_a
{
	int increment = 15000;
	public static void main(String args[])
	{
		employee e = new employee();
		System.out.println("Programmer Salary is " + e.salary);
		System.out.println("Increment of Programmer is " + e.increment);
	}
}
