public class call_value 
{
int data = 250;
void change(int data)
{
	data = data + 100;
}
public static void main(String args[])
{
	call_value c = new call_value();
	System.out.println("Before Changes the value is " + c.data);
	c.change(500);
	System.out.println("After Changes the value is " + c.data);
}
}
