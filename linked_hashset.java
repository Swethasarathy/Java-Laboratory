import java.util.*;
public class linked_hashset 
{
public static void main(String args[])
{
	  LinkedHashSet<String> a = new LinkedHashSet<String>();  
	  a.add("Swetha");  
	  a.add("Krishika");  
	  a.add("Sooriya");
	  a.add("Swetha");
	  a.add("Ashwini");  
	  Iterator<String> i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
