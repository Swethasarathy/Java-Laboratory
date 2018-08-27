public class local_in 
{
private int a = 55;
void display()
{
	class locality
	{
		void data()
		{
			System.out.println("The value of the variable is : " + a);
		}
	}
	locality a = new locality();
	a.data();
}
public static void main(String args[])
{
	local_in i = new local_in();
	i.display();
}
}
