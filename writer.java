import java.io.*;
public class writer 
{
public static void main(String args[])
{
	try
	{
		FileWriter f1 = new FileWriter("red1.txt");
		f1.write("InputStream and OutputSteam Classes are abstract classes");
		f1.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("This code writes data into the file red1");
}
}
