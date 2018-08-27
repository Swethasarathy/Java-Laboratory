import java.util.Scanner;
public class private_access 
{
private int reg;
private String name;
Scanner in = new Scanner(System.in);
private void display()
{
	System.out.println("Reg NO : " + reg);
	System.out.println("Name : " + name);
}
void data()
{
	System.out.println("Enter the Reg NO");
	reg = in.nextInt();
	System.out.println("Enter the Name");
	name = in.next();
	display();
}
}
class student extends private_access
{
	public static void main(String args[])
	{
	student s = new student();
	s.data();
	}
}