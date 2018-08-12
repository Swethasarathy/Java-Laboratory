public class purpose_default 
{
int reg;
String name;
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	purpose_default a1 = new purpose_default();
	purpose_default a2 = new purpose_default();
	a1.display();
	a2.display();
}
}
