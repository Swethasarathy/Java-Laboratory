public class instance2 
{
}
class simple extends instance2
{
	public static void main(String args[])
	{
		simple s1 = new simple();
		System.out.println(s1 instanceof instance2);
	}
}
