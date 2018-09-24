import java.util.*;
public class tree_set 
{
public static void main(String args[])
{
	TreeSet<String> a = new TreeSet<String>();     
	  a.add("Prabhas");
	  a.add("Vijay Devarkonda"); 
	  a.add("Ram Charan");
	  a.add("Prabhas");
	  a.add("Naga Chaitanya");  

	  Iterator<String> i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
