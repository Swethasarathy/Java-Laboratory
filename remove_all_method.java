import java.util.*;
public class remove_all_method 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Swetha");  
	  a.add("Krishika");  
	  a.add("Sooriya");  
	  ArrayList<String> al = new ArrayList<String>();  
	  al.add("Divya");  
	  al.add("Varshini");  
	  a.removeAll(al);  
	  System.out.println("Iterating the elements after removing the elements of al");  
	  Iterator i=a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
