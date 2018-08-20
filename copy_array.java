public class copy_array 
{
public static void main(String args[])
{
	char[] source = {'b', 's', 'w', 'e', 't', 'h', 'a', 'h', 'e', 'l', 'l', 'o', 'y'};
	char[] newstring = new char[6];
	System.arraycopy(source,1,newstring,0,6);
	System.out.println("The string is ");
	System.out.println(new String(newstring));
}
}
