public class internfunc 
{
public static void main(String args[])
{
	String str1 = new String("Swetha");
	String str2 = str1.intern();
	System.out.println("The string is " +str2);
	
}
}
