import java.util.*;
public class hash_table 
{
public static void main(String args[])
{
	  Hashtable<Integer,String> h = new Hashtable<Integer,String>();  
	  h.put(129,"Swetha");  
	  h.put(157,"Sooriya");  
	  h.put(135,"Ashwini");  
	  h.put(102,"Varshini");
	  h.put(173,"Sai");
	  for(Map.Entry m:h.entrySet())
	  {  
	   System.out.println("\nID : "+m.getKey());
	   System.out.println("Name : "+m.getValue());  
	  }  
}
}
