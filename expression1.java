import java.util.regex.*;
public class expression1
{
public static void main(String args[])
{
	System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "swetha98"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Swetha"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "Swethasheela98"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "SwethA98"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Swetha@5"));
}
}
