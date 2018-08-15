public class super_method 
{
void message()
{
	System.out.println("Welcome");
}
}
class person extends super_method
{
	void message()
	{
		System.out.println("Introduction to Java Programs");
	}
	void display()
	{
		message();
		super.message();
	}
	public static void main(String args[])
	{
		person a = new person();
		a.display();
	}
}