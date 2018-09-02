import java.io.*;
public class printclass 
{
public static void main(String args[]) throws Exception
{
	FileOutputStream fout = new FileOutputStream("outfile.txt");
	PrintStream pout = new PrintStream(fout);
	pout.println("Reg No : 201603055");
	pout.println("First Name : Swetha");
	pout.println("Last Name : Parthasarathy");
	pout.println("Dept : IT");
	pout.println("College : Rajalakshmi Institute Of Technology");
	pout.close();
	fout.close();
	System.out.println("Data is written into the file using Print Stream Class");
}
}
