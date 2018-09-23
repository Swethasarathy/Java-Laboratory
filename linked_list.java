import java.util.*;
public class linked_list 
{
public static void main(String args[])
{
	LinkedList<String> a = new LinkedList<String>();  
	  a.add("Swetha");  
	  a.add("Sheela");  
	  a.add("Parthasarathy");  
	  a.add("Sooriya");  
	  Iterator<String> i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
