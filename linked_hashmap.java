import java.util.*;
public class linked_hashmap 
{
public static void main(String args[])
{
	  LinkedHashMap<Integer,String> h = new LinkedHashMap<Integer,String>();  
	  h.put(107,"Digiatl Signal Processing");
	  h.put(100,"Web Programming");  
	  h.put(152,"Wireless Communication");
	  h.put(109,"Computer Networks");  
	  h.put(125,"Graphics and Multimedia");  
   	  for(Map.Entry m:h.entrySet())
   	  {  
	   System.out.println("\nID : "+m.getKey());
	   System.out.println("Title: "+m.getValue());  
	  }  
}
}
