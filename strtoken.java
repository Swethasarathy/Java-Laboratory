import java.util.StringTokenizer;
public class strtoken 
{
public static void main(String args[])
{
	StringTokenizer s = new StringTokenizer("I am Swetha"," ");
	while(s.hasMoreTokens())
	{
		System.out.println(s.nextToken());
	}
}
}
