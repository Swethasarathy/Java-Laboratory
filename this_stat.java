public class this_stat 
{
	this_stat getthis_stat()
	{
		return  this;
	}
	void message()
	{
		System.out.println("Introduction to Java");
	}
	}
	class test
	{
	public static void main(String args[])
	{
		new this_stat().getthis_stat().message();
	}

}
