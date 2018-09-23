import java.util.*;
public class hash_set 
{
public static void main(String args[])
{
	HashSet<String> a = new HashSet<String>();  
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
