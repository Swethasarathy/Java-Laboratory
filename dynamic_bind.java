public class dynamic_bind 
{
void display()
{
	System.out.println("Name : Swetha");
	System.out.println("Account No : 125293824");
}
}
class person extends dynamic_bind
{
	void display()
	{
		System.out.println("Available Balance : 15000.0");
	}
	public static void main(String args[])
	{
		dynamic_bind d = new person();
		d.display();
	}
}
