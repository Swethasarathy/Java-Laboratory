public class super_key 
{
int id = 55;
}
class inherited extends super_key
{
	int id = 105;
	void display()
	{
		System.out.println(id);
	}
	public static void main(String args[])
	{
		inherited i = new inherited();
		i.display();
	}
}