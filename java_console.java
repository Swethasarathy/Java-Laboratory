import java.io.Console;
public class java_console 
{
public static void main(String args[])
{
	Console c1 = System.console();
	//System.out.println("Enter your Name : ");
	//String name = c1.readLine();
	System.out.println("\nEnter your Dept : ");
	String dept = c1.readLine();
	//System.out.println("\nName : " + name);
	System.out.println("Dept : " + dept);
}
}
