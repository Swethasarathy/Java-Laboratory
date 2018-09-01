import java.io.*;
public class input 
{
public static void main(String args[])
{
	try
	{
		FileInputStream fin = new FileInputStream("file1.txt");
		int a = 0;
		while((a=fin.read())!=-1)
		{
			System.out.print((char)a);
		}
		fin.close();
		System.out.println("\nFile has been read successfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}
