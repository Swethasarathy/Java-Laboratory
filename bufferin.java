import java.io.*;
public class bufferin 
{
public static void main(String args[])
{
	try
	{
		FileInputStream fin = new FileInputStream("folder.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int a;
		while((a=bin.read())!=-1)
		{
			System.out.print((char)a);
		}
		bin.close();
		fin.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
