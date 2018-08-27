public class ignorecase 
{
public static void main(String args[])
{
	String str1 = "SWETHA";
	String str2 = "Swetha";
	String str3 = "swetha";
	String str4 = "SWETHA";
	System.out.println("Comparing the strings  str1 and str2 : "  + str1.equals(str2));
	System.out.println("Comparing the strings  str1 and str3 : "  + str1.equals(str3));
	System.out.println("Comparing the strings  str1 and str4 : "  + str1.equals(str4));
	System.out.println("Comparing the strings  str1 and str2 using equalsIgnoreCase : "  + str1.equalsIgnoreCase(str2));
	System.out.println("Comparing the strings  str1 and str3 using equalsIgnoreCase : "  + str1.equalsIgnoreCase(str3));
	System.out.println("Comparing the strings  str1 and str4 using equalsIgnoreCase : "  + str1.equalsIgnoreCase(str4));
}
}
