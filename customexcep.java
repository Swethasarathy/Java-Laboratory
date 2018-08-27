class testing extends  Exception
{
testing(String s)
{
	super(s);
}
}
public class customexcep
{
	static void validate(int a)throws testing
	{
		if(a<18)
			throw new testing("Not eligible to get licence");
		else
			System.out.println("Eligible to get licence");
	}
	public static void main(String args[])
	{
		try
		{
			validate(17);
		}
		catch(Exception e)
		{
			System.out.println("An Exception has occurred " + e);
		}
	}
}
