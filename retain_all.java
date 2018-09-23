import java.util.*;
public class retain_all 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Swetha");  
	  a.add("Parthasarathy");  
	  a.add("Sheela");  
	  ArrayList<String> al = new ArrayList<String>();  
	  al.add("Swetha");  
	  al.add("Sooriya");  
	  a.retainAll(al);  
	  System.out.println("Iterating the elements after retaining the elements of al");  
	  Iterator i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  

}
}
