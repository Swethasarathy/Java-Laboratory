abstract class abstract_class 
{
abstract_class()
{
	System.out.println("Constructor is executed");
}
abstract void display();
void department()
{
	System.out.println("IT Department");
}
}
class year extends abstract_class
{
	void display()
	{
		System.out.println("III Year");
	}
}
class test
{
	public static void main(String args[])
	{
		abstract_class a = new year();
		a.display();
		a.department();
	}
}
