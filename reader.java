import java.io.*;
public class reader 
{
public static void main(String args[]) throws Exception
{
FileReader r1 = new FileReader("red1.txt");	
int a;
while((a=r1.read())!=-1)
{
	System.out.print((char)a);
}
r1.close();
}
}