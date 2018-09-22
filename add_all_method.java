import java.util.*;
public class add_all_method 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Swetha");  
	  a.add("Sheela");  
	  a.add("Parthasarathy");  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Sooriya");  
	  al.add("Krishika");  
	  a.addAll(al);    
	  Iterator i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
