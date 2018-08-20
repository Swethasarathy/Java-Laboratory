public class runtime 
{
int getinterest()
{
	return 0;
}
}
class scb extends runtime
{
	int getinterest()
	{
		return 7;
	}
}
class sbi extends runtime
{
	int getinterest()
	{
		return 4;
	}
}
class kvb extends runtime
{
	int getinterest()
	{
		return 9;
	}
}
class account
{
	public static void main(String args[])
	{
		runtime r1 = new scb();
		runtime r2 = new sbi();
		runtime r3 = new kvb();
		System.out.println("SCB Rate of Interest is " + r1.getinterest());
		System.out.println("SBI Rate of Interest is " + r2.getinterest());
		System.out.println("KVB Rate of Interest is " + r3.getinterest());
	}
}