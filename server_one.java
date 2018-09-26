import java.io.*;
import java.net.*;
public class server_one 
{
public static void main(String args[])
{
	try
	{
		ServerSocket s1= new ServerSocket(4067);
		Socket s = s1.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		String str = (String)din.readUTF();
		System.out.println("Data = " +str);
		s1.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
