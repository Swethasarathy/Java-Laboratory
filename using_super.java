public class using_super 
{
int id = 55;
}
class parent extends using_super
{
	int id = 115;
	void display()
	{
		System.out.println(super.id);
	}
	public static void main(String args[])
	{
		parent p = new parent();
		p.display();
	}
}