public class multiple_obj 
{
int length, breadth;
void insertdata(int l, int b)
{
	length = l;
	breadth = b;
}
void display()
{
	System.out.println("Area of Rectangle is " + (length * breadth));
}
public static void main(String args[])
{
	multiple_obj r1 = new multiple_obj(), r2 = new multiple_obj();
	r1.insertdata(17,8);
	r2.insertdata(29,5);
	r1.display();
	r2.display();
}
}
