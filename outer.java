public class outer
{
static int a = 529;
static class inner
{
	void data()
	{
		System.out.println("The value is : " + a);
	}
}
public static void main(String args[])
{
	outer.inner s = new outer.inner();
	s.data();
}
}
