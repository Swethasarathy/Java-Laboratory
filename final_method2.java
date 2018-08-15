public class final_method2 
{
final void run()
{
	System.out.println("Java Program for final method");
}
}
class post extends final_method2
{
	public static void main(String args[])
	{
		new post().run();
		}
}