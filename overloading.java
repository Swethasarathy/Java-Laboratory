public class overloading 
{
void addition(int x, int y)
{
	System.out.println("The sum of  "+ x +" and " + y + " is " +(x + y));
}
void addition(int x, int y, int z)
{
	System.out.println("The sum of  "+ x +"  " + y + " and " + z + " is " + (x + y + z));
}
public static void main(String args[])
{
	overloading a = new overloading();
	a.addition(15,8,23);
	a.addition(29, 5);
}
}
