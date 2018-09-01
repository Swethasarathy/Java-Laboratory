import java.io.*;
public class bufferout 
{
public static void main(String args[]) throws Exception
{
	FileOutputStream fout = new FileOutputStream("folder.txt");
	BufferedOutputStream bout = new BufferedOutputStream(fout);
	String str = "Java is a platform independent language";
	byte b[] = str.getBytes();
	bout.write(b);
	bout.flush();
	bout.close();
	System.out.println("Writes data to file using BufferedOutputStream");
}
}
