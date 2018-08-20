public class clone1 implements Cloneable 
{
int reg;
String name;
clone1(int reg, String name)
{
	this.reg= reg;
	this.name = name;
}
public Object clone()throws CloneNotSupportedException
{
return super.clone();	
}
public static void main(String args[])
{
	try 
	{
		clone1 c1 = new clone1(55,"Swetha");
		clone1 c2 = (clone1)c1.clone();
		System.out.println("Reg No : " + c1.reg);
		System.out.println("Name : " + c1.name);
		System.out.println("Reg No : " + c2.reg);
		System.out.println("Name : " + c2.name);
	}
	catch(CloneNotSupportedException e)
	{
	}
}
}
