public class equal 
{
public static void main(String args[])
{
	String str1 = "Swetha";
	String str2 = "Swetha";
	String str3 = new String ("Swetha");
	String str4 = "Sheela";
	System.out.println("Comparing the strings  str1 and str2 : " +str1.equals(str2));
	System.out.println("Comparing the strings  str1 and str3 : " +str1.equals(str3));
	System.out.println("Comparing the strings  str1 and str4 : " +str1.equals(str4));
}
}
class testequal
{
public static void main(String args[])
{
	String str1 = "Swetha";
	String str2 = "SWETHA";
	System.out.println("Comparing the strings str1 and str2 : " +str1.equals(str2));
	//System.out.println("Comparing the strings str1 and str3 : " +str1.equalsIgnoreCase(str3));
}
}