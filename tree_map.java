import java.util.*;
public class tree_map 
{
public static void main(String args[])
{
	  TreeMap<Integer,String> h = new TreeMap<Integer,String>();  
	  h.put(105,"Swetha");  
	  h.put(172,"Sooriya");  
	  h.put(141,"Varshini");  
	  h.put(123,"Ashwini");
	  h.put(153,"Krishika");  
	  for(Map.Entry m:h.entrySet())
	  {  
	   System.out.println("\nID : "+m.getKey());
	   System.out.println("Name : "+m.getValue());  
	  }  
}
}
