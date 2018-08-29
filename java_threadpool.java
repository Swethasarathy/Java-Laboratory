import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java_threadpool 
{
public static void main(String args[])
{
	ExecutorService obj = Executors.newFixedThreadPool(5);
	for(int i =0; i<10; i++)
	{
		Runnable worker = new threadpool("" + i);
		obj.execute(worker);
	}
	obj.shutdown();
	while(!obj.isTerminated())
	{
		
	}
	System.out.println("Finished all threads");
}
}
