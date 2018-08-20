interface execute
{
	void display();
}
interface show
{
	void display();
}
public class multi_interface implements execute, show 
{
public void display()
{
	System.out.println("Multiple inheritance is possible  in java using interface");
}
public static void main(String args[])
{
	multi_interface m = new multi_interface();
	m.display();
}
}
