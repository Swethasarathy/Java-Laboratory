import java.net.*;
public class receiver_data 
{
public static void main(String args[]) throws Exception
{
	DatagramSocket dsock = new DatagramSocket(3200);
	byte[] buff = new byte[1024];
	DatagramPacket dpack = new DatagramPacket(buff, 1024);
	dsock.receive(dpack);
	String str = new String(dpack.getData(), 0, dpack.getLength());
	System.out.println(str);
	dsock.close();
}
}
