public class this_arg 
{
void sample(this_arg a)
{
	System.out.println("The method is invoked");
}
void result()
{
	sample(this);
}
public static void main(String args[])
{
	this_arg t = new this_arg();
	t.result();
}
}
