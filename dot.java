import java.util.regex.*;
public class dot 
{
public static void main(String args[])
{
	System.out.println(Pattern.matches(".s", "as"));
	System.out.println(Pattern.matches(".s", "ask"));
	System.out.println(Pattern.matches(".o", "so"));
	System.out.println(Pattern.matches("..t", "kite"));
	System.out.println(Pattern.matches("...e", "kite"));
	System.out.println(Pattern.matches(".....a", "swetha"));
}
}
