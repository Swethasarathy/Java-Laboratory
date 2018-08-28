public class garbage 
{
public void finalize()
{
	System.out.println("This program illustrates garbage collection ");
}
public static void main(String args[])
{
	garbage g1 = new garbage();
	garbage g2 = new garbage();
	g1 = null;
	g2 = null;
	System.gc();
}
}
