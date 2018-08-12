public class copy_construct 
{
int reg;
String name;
copy_construct(int r, String n)
{
	reg = r;
	name = n;
}
copy_construct(copy_construct c)
{
	reg = c.reg;
	name = c. name;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	copy_construct a1 = new copy_construct(55, "Swetha");
	copy_construct a2 = new copy_construct(a1);
	a1.display();
	a2.display();
}
}

