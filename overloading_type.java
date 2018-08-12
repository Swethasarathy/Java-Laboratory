public class overloading_type 
{
void addition(int x, int y)
{
	System.out.println("The sum of " + x + " and " + y + " is "+ (x+y));
}
void addition(double x, double y)
{
	System.out.println("The sum of " + x + " and " + y + " is "+ (x+y));
}
public static void main(String args[])
{
	overloading_type a = new overloading_type();
	a.addition(29, 5);
	a.addition(38.5,  47.2);
}
}
