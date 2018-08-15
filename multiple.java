public class multiple 
{
void message()
{
	System.out.println("Introduction to Java");
}
}
class inherit
{
	void message()
	{
		System.out.println(" Programs");
	}
}
class result extends multiple,inherit
{
	public static void main(String args[])
	{
		result r = new result();
		r.message();
	}
}
