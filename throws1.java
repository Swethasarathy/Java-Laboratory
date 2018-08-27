import java.io.IOException;
public class throws1 
{
void test()throws IOException
{
	throw new IOException("Error occurred in device");
}
void sample()throws IOException
{
	test();
}
void poster()
{
	
	try
	{
		sample();
	}
	catch(Exception e)
	{
		System.out.println("Exception is handeled");
	}
}
public static void main(String args[])
{
	throws1 t = new throws1();
	t.poster();
}
}
