public class this_call
{
int reg;
String name, city;
this_call(int reg, String name)
{
	this.reg = reg;
	this.name = name;
}
this_call(int reg , String name, String city)
{
	this(reg, name);
	this.city = city;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
	System.out.println("City : " + city);
}
public static void main(String args[])
{
	this_call t1 = new this_call(55 , "Swetha");
	this_call t2 = new this_call(57 , "Sooriya" , "Chennai");
	t1.display();
	t2.display();
}
}
