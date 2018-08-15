public class aggregation 
{
int square(int a)
{
	return a * a;
}
}
class circle
{
	aggregation a;
	double pi = 3.14;
double area(int radius)
{
	a = new aggregation();
	int ssquare = a.square(radius);
	System.out.print("Area Of Circle with radius " + radius + " is ");
	return pi * ssquare;
}
public static void main(String args[])
{
	circle c = new circle();
	double test = c.area(7);
	System.out.println(test);
}
}