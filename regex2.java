import java.util.regex.*;
public class regex2 
{
public static void main(String args[])
{
	System.out.println("MetaCharacters d......");
	System.out.println(Pattern.matches("\\d", "swetha"));
	System.out.println(Pattern.matches("\\d","abcd"));
	System.out.println(Pattern.matches("\\d", "5898"));
	System.out.println(Pattern.matches("\\d", "5"));
	System.out.println(Pattern.matches("\\d", "2016"));
	System.out.println(Pattern.matches("\\d", "5898swetha"));
	System.out.println(Pattern.matches("\\d", "323abc"));
	System.out.println("MetaCharacters D......");
	System.out.println(Pattern.matches("\\D", "swetha"));
	System.out.println(Pattern.matches("\\D", "s"));
	System.out.println(Pattern.matches("\\D", "5"));
	System.out.println(Pattern.matches("\\D", "5898swetha"));
	System.out.println(Pattern.matches("\\D", "5898"));
	System.out.println("MetaCharacters D with quantifier...");
	System.out.println(Pattern.matches("\\D*", "swetha"));
	System.out.println(Pattern.matches("\\D*", "5898swetha"));
	System.out.println(Pattern.matches("\\D*", "5898"));
}
}
