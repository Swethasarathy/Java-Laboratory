public class overload_construct 
{
int reg, age;
String name;
overload_construct(int r, String n)
{
	reg = r;
	name = n;
}
overload_construct(int r, String n, int a)
{
	reg = r;
	name = n;
	age = a;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
	System.out.println("Age : " + age);
}
public static void main(String args[])
{
	overload_construct a1 = new overload_construct(55, "Swetha", 20);
	overload_construct a2 = new overload_construct(57, "Sooriya");
	a1.display();
	a2.display();
}
}
