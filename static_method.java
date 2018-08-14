public class static_method 
{
int reg;
String name;
static String college = "RIT";
static void change()
{
	college = "Rajalakshmi Institute Of Technology";
}
static_method(int i, String n)
{
	reg = i;
	name = n;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
	System.out.println("College : " + college);
}
public static void main(String args[])
{
	static_method.change();
	static_method s1 = new static_method(55, "Swetha");
	static_method s2 = new static_method(57, "Sooriya");
	static_method s3 = new static_method(58, "Yoga Sri");
	s1.display();
	s2.display();
	s3.display();
}
}
