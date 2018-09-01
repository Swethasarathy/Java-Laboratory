import java.io.*;
public class charwriter 
{
public static void main(String args[]) throws Exception
{
	CharArrayWriter ch = new CharArrayWriter();
	ch.write("Socket class is mainly used on client side");
	FileWriter w1 = new FileWriter("f1.txt");
	FileWriter w2 = new FileWriter("f2.txt");
	FileWriter w3 = new FileWriter("f3.txt");
	FileWriter w4 = new FileWriter("f4.txt");
	FileWriter w5 = new FileWriter("f5.txt");
	ch.writeTo(w1);
	ch.writeTo(w2);
	ch.writeTo(w3);
	ch.writeTo(w4);
	ch.writeTo(w5);
	w1.close();
	w2.close();
	w3.close();
	w4.close();
	w5.close();
	System.out.println("Writing common data to five files using Char Array Writer Class");
}
}
