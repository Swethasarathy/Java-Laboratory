public class this_keyword 
{
int reg;
String name;
this_keyword(int reg, String name)
{
	reg = reg;
	name = name;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	this_keyword t1 = new this_keyword(55, "Swetha");
	this_keyword t2 = new this_keyword(28, "Meenakshi");
	t1.display();
	t2.display();
}
}
