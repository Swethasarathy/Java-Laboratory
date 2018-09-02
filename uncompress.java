import java.io.*;
import java.util.zip.*;
public class uncompress 
{
public static void main(String args[])
{
	try
	{
		FileInputStream fin = new FileInputStream("out.txt");
		InflaterInputStream in = new InflaterInputStream(fin);
		FileOutputStream fout = new FileOutputStream("uncompressedtext.java");
		int a;
		while((a=in.read())!=-1)
		{
			fout.write((byte)a);
			fout.flush();
		}
		fin.close();
		fout.close();
		in.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Uncompressing the file out.txt to uncompressed.java");
}
}
