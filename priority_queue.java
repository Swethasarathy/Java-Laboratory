import java.util.*;
public class priority_queue 
{
public static void main(String args[])
{
	PriorityQueue<String> prior = new PriorityQueue<String>();  
	prior.add("Anupppama");  
	prior.add("Nivin Pauly");  
	prior.add("Nazriya Nazim");  
	prior.add("Dulquer Salman");  
	prior.add("Sai Pallavi");  
	System.out.println("Head:"+prior.element());  
	System.out.println("Head:"+prior.peek());  
	System.out.println("Iterating the Queue Elements:");  
	Iterator i = prior.iterator();  
	while(i.hasNext())
	{  
	System.out.println(i.next());  
	}  
	prior.remove();  
	prior.poll();  
	System.out.println("After Removing Two Elements:");  
	Iterator<String> itr = prior.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}  
}
}
