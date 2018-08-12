public class record 
{
int reg;
String name;
void insertdata(int r, String n ) 
{
reg = r;
name = n;
}
void display()
{
	System.out.println("Reg No : " + reg);
	System.out.println("Name : " + name);
}
public static void main(String args[])
{
	record r1 = new record();
	record r2 = new record();
	r1.insertdata(55, "Swetha");
	r2.insertdata(56, "Sooriya");
	r1.display();
	r2.display();
}
}
