public class free_tot 
{
public static void main(String args[]) throws Exception
{
	Runtime r1 = Runtime.getRuntime();
	System.out.print("Total Memory : " + r1.totalMemory());
	System.out.print("Free Memory : " + r1.freeMemory());
	for(int i=0; i<10000; i++)
	{
		new free_tot();
	}
	System.out.println("After creating 10000 instance , Free Memory : " + r1.freeMemory());
	System.gc();
	System.out.println("After gc(), Free memory : " +r1.freeMemory());
}
}
