import java.util.regex.*;
public class regex1 
{
public static void main(String args[])
{
	System.out.println(Pattern.matches("[amn]", "abcd"));
	System.out.println(Pattern.matches("[amn]", "a"));
	System.out.println(Pattern.matches("[amn]", "apple"));
	System.out.println(Pattern.matches("[amn]", "ammmna"));
	System.out.println(Pattern.matches("[amn]", "s"));
}
}
