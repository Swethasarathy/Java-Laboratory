public class override 
{
void test()
{
	System.out.println("Test is running");
}
}
class report extends override
{
	public static void main(String args[])
	{
		report r = new report();
		r.test();
	}
}
