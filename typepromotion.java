public class typepromotion 
{
void addition(int x, long y)
{
	System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
}
void addition(int x, int y, int z)
{
	System.out.println("The sum of "+ x + " " + y + " and " + z + " is " + (x + y + z));
}
public static void main(String args[])
{
	typepromotion t = new typepromotion();
	t.addition(29 ,  5);
	t.addition(38,  46, 54);
}
}
