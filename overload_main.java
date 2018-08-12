public class overload_main 
{
public static void main(int a)
{
	System.out.println(a);
}
public static void main(String args[])
{
	System.out.println("Main method invoked");
	main(15);
}
}
