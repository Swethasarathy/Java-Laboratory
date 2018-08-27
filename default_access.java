package javapack;
public class default_access 
{
	int reg;
    String name;
void display(int r, String n)
{
	reg = r;
	name = n;
	System.out.println("Reg NO: " + reg );
	System.out.println("Name: " + name );
}
public static void main(String args[])
{
	default_access obj = new default_access();
	obj.display(55, "Swetha");
}
}
