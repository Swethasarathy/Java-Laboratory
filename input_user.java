import java.util.Scanner;
public class input_user 
{
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter your RegNo: ");
	int id = in.nextInt();
	System.out.print("\nEnter your First Name : ");
	String name = in.next();
	System.out.print("\nEnter your Last Name : ");
	String lname = in.next();
	System.out.print("\nEnter your CGPA : ");
	float cgpa = in.nextFloat();
	System.out.print("\nEnter the fees amount : ");
	double fee = in.nextDouble();
	System.out.println("\n\nReg No : " +id);
	System.out.println("First Name : " +name);
	System.out.println("Last Name : " +lname);
	System.out.println("CGPA : " +cgpa);
	System.out.println("Fees : " +fee);
	in.close();
}
}
