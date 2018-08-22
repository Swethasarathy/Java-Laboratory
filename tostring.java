public class tostring 
{
int reg;
String name;
String dept;
tostring(int reg, String name, String dept)
{
	this.reg = reg;
	this.name = name;
	this.dept = dept;
}
public static void main(String args[])
{
	tostring t1 = new tostring(55,"Swetha","IT");
	tostring t2 = new tostring(57,"Saranya", "CSE");
	System.out.println(t1);
	System.out.println(t2);
}
}
