import java.util.regex.*;
public class expression2 
{
public static void main(String args[])
{
	System.out.println("By Character classes and quantifiers");
	System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9953038949"));
	System.out.println(Pattern.matches("[789][0-9]{9}","9953038949"));		
	System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
	System.out.println(Pattern.matches("[345][0-9]{9}", "6953038949"));
	System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
	System.out.println("By metacharacters...");
	System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
	System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));
}
}
