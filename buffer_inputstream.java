import java.io.*;
public class buffer_inputstream 
{
public static void main(String args[]) throws Exception
{
	InputStreamReader buff = new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(buff);
	System.out.print("Enter your Name : ");
	String name = br.readLine();
	System.out.print("\nEnter your Dept : ");
	String dept = br.readLine();
	System.out.println("\nName : " + name);
	System.out.println("Dept : " + dept);
}
}
