import java.io.*;
import java.net.*;
public class http_url 
{
public static void main(String args[])
{
	try
	{
		URL url = new URL("http://google.com");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		for(int i=1; i<=8; i++)
		{
			System.out.println(conn.getHeaderFieldKey(i) + " = " + conn.getHeaderField(i));
		}
		conn.disconnect();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
