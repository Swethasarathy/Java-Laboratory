import java.io.*;
import java.util.zip.*;
public class compress 
{
public static void main(String args[])
{
	try
	{
		FileInputStream fin = new FileInputStream("printclass.java");
		FileOutputStream fout = new FileOutputStream("out.txt");
		DeflaterOutputStream out = new DeflaterOutputStream(fout);
		int a;
		while((a=fin.read())!=-1)
		{
			out.write((byte)a);
			out.flush();
		}
		fin.close();
		out.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("This code demonstrates reading data of a file and compressing it in another file");
}
}
