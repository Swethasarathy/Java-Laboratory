import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class threadpool implements Runnable 
{
private String data;
public threadpool(String d)
{
this.data = d;
}
public void run()
{
	System.out.println(Thread.currentThread().getName() +  "(Start) Data = " + data);
	processmessage();
	System.out.println(Thread.currentThread().getName() + " (End)");
}
private void processmessage()
{
	try
	{
		Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
}
