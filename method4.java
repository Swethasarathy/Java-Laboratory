interface stud
{
	void canara();
	void scb();
	void cub();
	void sbi();
}
abstract class fun implements stud
{
	public void canara()
	{
		System.out.println("This is Canara Bank");
	}
}
class call extends fun
{
	public void scb()
	{
		System.out.println("This is Standard Chartered Bank");
	}
	public void cub()
	{
		System.out.println("This is City Union Bank");		
	}
	public void sbi()
	{
		System.out.println("This is State Bank Of India");		
	}
}
public class method4 
{
public static void main(String args[])
{
	stud s = new call();
	s.canara();
	s.scb();
	s.cub();
	s.sbi();
}
}
