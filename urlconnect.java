import java.io.*;
import java.net.*;
public class urlconnect 
{
public static void main(String args[])
{
	try
	{
		
		URL url = new URL("http://www.gmail.com");
		URLConnection conn = url.openConnection();
		InputStream stream = conn.getInputStream();
		int a;
		while((a = stream.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
