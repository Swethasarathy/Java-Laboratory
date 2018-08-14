public class counter_static 
{
static int count = 0;
counter_static()
{
	count++;
	System.out.println("Value of count : " + count);
}
public static void main(String args[])
{
	counter_static a1 = new counter_static();
	counter_static a2 = new counter_static();
	counter_static a3 = new counter_static();
}
}
