import java.io.*;
public class output 
{
public static void main(String args[])
{
	try
	{
		FileOutputStream fout = new FileOutputStream("file1.txt");
		String str = "JavaScript is a scripting language";
		byte b[] = str.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Data is written into the file successfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
