import java.util.regex.*;
public class expression 
{
public static void main(String args[])
{
	Pattern a = Pattern.compile(".....a");
	Matcher m = a.matcher("Swetha");
	boolean b1  = m.matches();
	boolean b2 = Pattern.compile(".....a").matcher("Swetha").matches();
	boolean b3 = Pattern.matches(".....a", "Swetha");
	boolean b4 = Pattern.matches("..e", "Swetha");
	System.out.println(b1 + " " + b2 + " " + b3 + " " +b4);
}
}
