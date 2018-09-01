import java.io.*;
public class byte_array 
{
public static void main(String args[]) throws Exception
{
	FileOutputStream fout1 = new FileOutputStream("text1.txt");
	FileOutputStream fout2 = new FileOutputStream("text2.txt");
	ByteArrayOutputStream bout = new ByteArrayOutputStream();
	byte[] bs = {83, 87, 69, 84, 72, 65, 32};
	 bout.toString();
	bout.write(bs);
	bout.writeTo(fout1);
	bout.writeTo(fout2);
	bout.flush();
	bout.close();
	System.out.println("Data is written in two files using Byte Array Output Stream class");
}
}

