import java.io.*;
public class seq_input2 
{
public static void main(String args[]) throws Exception
{
	FileInputStream fin1 = new FileInputStream("text1.txt");
	FileInputStream fin2 = new FileInputStream("text2.txt");
	FileOutputStream fout = new FileOutputStream("text3.txt");
	SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
	int a;
	while((a=sin.read())!=-1)
	{
		fout.write(a);
	}
	sin.close();
	fout.close();
	fin1.close();
	fin2.close();
	System.out.println("Data from two files is written into one file using Sequence Input Stream Class");
}
}
