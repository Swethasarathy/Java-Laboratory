public class equal 
{
public static void main(String args[])
{
	String str1 = "Swetha";
	String str2 = "Sheela";
	String str3 = new String("SWETHA");
	String str4 = "Swetha";
	String str5 = new String("swetha");
	System.out.println("Comparing the strings  str1 and str2 : "  + str1.equals(str2));
	System.out.println("Comparing the strings  str1 and str3 : " + str1.equals(str3));
	System.out.println("Comparing the strings  str1 and str4 : " + str1.equals(str4));
	System.out.println("Comparing the strings  str1 and str5 : " + str1.equals(str5));
}
}

