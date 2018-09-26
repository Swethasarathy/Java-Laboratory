import java.util.*;
public class sort_string_obj 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();
	a.add("Swetha");
	a.add("Ashwini");
	a.add("Krishika");
	a.add("Divya");
	a.add("Varshini");
	Collections.sort(a);
	Iterator i = a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
