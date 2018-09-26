import java.io.*;
import java.net.*;
public class client_one 
{
public static void main(String args[])
{
try
{
	Socket s = new Socket("localhost",4067);
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	dout.writeUTF("Welcome to Socket Programming");
	dout.flush();
	dout.close();
	s.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
