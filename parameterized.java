public class parameterized 
{
int reg;
String name;
parameterized(int r, String n)
{
	reg = r;
	name = n;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	parameterized a1 = new parameterized(55, "Swetha");
	parameterized a2 = new parameterized(57, "Yoga Sri");
	a1.display();
	a2.display();
}
}
