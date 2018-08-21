public class capacityfunc 
{
public static void main(String args[])
{
	StringBuffer str = new StringBuffer();
	System.out.println(str.capacity());
	str.append("JavaScript");
	System.out.println(str.capacity());
	str.append("scripting language");
	System.out.println(str.capacity());
}
}
