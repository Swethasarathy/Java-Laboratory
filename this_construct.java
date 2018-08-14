public class this_construct 
{
int reg;
String name;
this_construct()
{
	System.out.println("Default Constructor is invoked");
}
this_construct(int reg, String name)
{
	this();
	this.reg = reg;
	this.name= name;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	this_construct t1 = new this_construct(55, " Swetha");
	this_construct t2 = new this_construct(57, " Saranya");
	t1.display();
	t2.display();
}
}
