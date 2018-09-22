import java.util.*;
public class array_list 
{
public static void main(String args[])
{
	  ArrayList<String> a = new ArrayList<String>();  
	  a.add("Swetha");  
	  a.add("Sooriya");  
	  a.add("Krishika");  
	  a.add("Yoga Sri");  
	  Iterator i= a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
