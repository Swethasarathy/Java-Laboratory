public class method_override 
{
void execute()
{
	System.out.println("Base class is running");
}
}
class run extends method_override
{
	void execute()
	{
		System.out.println("Inherited class is running");
	}
	public static void main(String args[])
	{
		run r = new run();
		r.execute();
	}
}

