abstract class abstract_method 
{
abstract void display();
}
class student extends abstract_method
{
	void display()
	{
		System.out.println("Reg No : 55");
		System.out.println("Name : Swetha");
	}
	public static void main(String args[])
	{
		abstract_method a = new student();
		a.display();
	}
}