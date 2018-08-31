class student
{
	int amount = 150000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdraws the amount");
		if(this.amount<amount)
		{
			System.out.println("Minimum balance available");
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		this.amount-=amount;
		System.out.println("Withdrawal transaction done successfully");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Deposit the amount");
		this.amount += amount;
		System.out.println("Deposit transaction done successfully");
		notify();
	}
}
public class inter_thread 
{
public static void main(String args[])
{
	final student s = new student();
	new Thread()
	{
		public void run()
		{
			s.withdraw(45000);
		} 
	} .start();
	new Thread()
	{
		public void run()
			{
				s.deposit(150000);
			}
	} .start();
	new Thread()
	{
		public void run()
		{
			s.withdraw(350000);
		} 
	} .start();
}

}
