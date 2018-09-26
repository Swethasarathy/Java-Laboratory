import java.io.*;
import java.net.*;
public class server_rw 
{
public static void main(String args[]) throws Exception
{
	ServerSocket s1 = new ServerSocket(1055);
	Socket s = s1.accept();
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout= new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str1 = "", str2 = "";
	while(!str1.equals("stop"))
	{
		str1 = din.readUTF();
		System.out.println("Client says : " +str1);
		str2 = br.readLine();
		dout.writeUTF(str2);
		dout.flush();
	}
	din.close();
	s.close();
	s1.close();
}
}
