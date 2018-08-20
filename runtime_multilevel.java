public class runtime_multilevel 
{
void display()
{
	System.out.println("Name : Swetha");
	System.out.println("Account No : 125296347");
}
}
class transaction extends runtime_multilevel
{
	void display()
	{
		System.out.println("Withdrawal : 12000.0");
	}
}
class balance extends transaction
{
	void display()
	{
		System.out.println("Available Balance : 10000.0");
	}
public static void main(String args[])
{
	runtime_multilevel r1, r2, r3;
	r1 = new runtime_multilevel();
	r2 = new transaction();
	r3 = new balance();
	r1.display();
	r2.display();
	r3.display();
}
}