public class this2 
{
int reg;
String name;
this2(int reg, String name)
{
	this.reg = reg;
	this.name = name;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	this2 t1 = new this2(55, "Swetha");
	this2 t2 = new this2(28, "Meenakshi");
	t1.display();
	t2.display();
}
}
