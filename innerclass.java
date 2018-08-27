public class innerclass 
{
private int a = 5;
class inner
{
	void data()
	{
		System.out.println("The value in the variable is : " + a);
	}
}
public static void main(String args[])
{
	innerclass i = new innerclass();
	innerclass.inner obj = i.new inner();
	obj.data();
}
}
