public class with_tostring 
{
int reg;
String name;
String dept;
with_tostring(int reg, String name, String dept)
{
	this.reg = reg;
	this.name = name;
	this.dept = dept;
}
public String toString()
{
	return reg + " " + name + " " + dept;
}
public static void main(String args[])
{
	with_tostring t1 = new with_tostring(55, "Swetha", "IT");
	with_tostring t2 = new with_tostring(57, "Yoga Sri", "CSE");
	System.out.println(t1);
	System.out.println(t2);
}
}
