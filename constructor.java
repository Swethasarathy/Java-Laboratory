package manual2;
public class constructor 
{
	simple obj;
	constructor(simple obj)
	{
		this.obj = obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
	}
	class simple
	{
		int data = 15;
		simple()
		{
			constructor t = new constructor(this);
			t.display();
		}
		public static void main(String args[])
		{
			simple s = new simple();
		}

}
