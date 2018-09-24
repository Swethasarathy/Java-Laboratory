import java.util.*;
public class hash_map 
{
public static void main(String args[])
{
	  HashMap<Integer,String> h = new HashMap<Integer,String>();  
	  h.put(148,"Digiatl Signal Processing");
	  h.put(101,"Web Programming");  
	  h.put(152,"Wireless Communication");
	  h.put(107,"Computer Networks");  
	  h.put(125,"Graphics and Multimedia");
	  for(Map.Entry mp:h.entrySet())
	  {  
	   System.out.println("\nId: "+mp.getKey());
	   System.out.println("Title : "+mp.getValue());  
	  }  
}
}
