abstract class tester
{
	abstract void display();
}
public class anonymous_in 
{
	public static void main(String args[])
	{
		tester t = new tester()
		{
			void display()
			{
				System.out.println("First Name : Swetha");
				System.out.println("Last Name  : Parthasarathy");
			}
		};
		t.display();
	}
}
