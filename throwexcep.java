public class throwexcep 
{
static void validate(int age)
{
	if(age<18)
		throw new ArithmeticException("Not eligible to get license");
	else
		System.out.println("Eligible to get license");
}
public static void main(String args[])
{
	validate(20);
}
}
