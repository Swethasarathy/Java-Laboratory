public class this_method 
{
void sample()
{
	System.out.println("The method is invoked");
}
void test()
{
	this.sample();
}
void result()
{
	test();
}
public static void main(String args[])
{
	this_method t1 = new this_method();
	t1.result();
}
}
