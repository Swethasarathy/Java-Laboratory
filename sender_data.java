import java.net.*;
public class sender_data 
{
public static void main(String args[]) throws Exception
{
	DatagramSocket dsock = new DatagramSocket();
	String str = "Sending Datagram Packet by Datagram Socket";
	InetAddress ip = InetAddress.getByName("127.0.0.5");
	DatagramPacket dpack = new DatagramPacket(str.getBytes(), str.length(), ip, 3200);
	dsock.send(dpack);
	dsock.close();
}
}
