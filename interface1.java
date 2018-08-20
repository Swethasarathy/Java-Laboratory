interface print
{
	void display();
}
public class interface1 implements print
{
public void display()
{
	System.out.println("Java program to illustrate interface concept");
}
public static void main(String args[])
{
	interface1 i = new interface1();
	i.display();
}
}
