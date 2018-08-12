public class record2 
{
int length, breadth;
void getdata(int l, int b)
{
	length = l;
	breadth = b;
}
void display()
{
	System.out.println("Area of rectangle is : " + (length * breadth));
}
public static void main(String args[])
{
	record2 r1 = new record2();
	record2 r2 = new record2();
	r1.getdata(15, 7);
	r2.getdata(29, 5);
	r1.display();
	r2.display();
}
}
