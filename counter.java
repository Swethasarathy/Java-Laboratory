public class counter 
{
int count = 0;
counter()
{
	count++;
	System.out.println("Counter : " + count);
}
public static void main(String args[])
{
	counter a1 = new counter();
	counter a2 = new counter();
	counter a3 = new counter();
}
}
