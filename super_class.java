public class super_class
{
super_class()
{
	System.out.println("Base class is executed");
}
}
class student extends super_class
{
	student()
	{
		super();
		System.out.println("Inherited class is executed");
	}
	public static void main(String args[])
	{
		student s = new student();
	}
}