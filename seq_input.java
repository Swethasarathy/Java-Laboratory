import java.io.*;
public class seq_input 
{
public static void main(String args[]) throws Exception
{
	FileInputStream fin1 = new FileInputStream("text1.txt");
	FileInputStream fin2 = new FileInputStream("text2.txt");
	SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
	int a;
	while((a=sin.read())!=-1)
	{
		System.out.print((char)a);
	}
	sin.close();
	fin1.close();
	fin2.close();
	System.out.println("\nData is read form two files using Sequence Input Stream Class");
}
}

