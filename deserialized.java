import java.io.*;
public class deserialized 
{
public static void main(String args[]) throws Exception
{
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("stud.txt"));
	employee e = (employee)in.readObject();
	System.out.println("ID : " +e.id);
	System.out.println("Name : " +e.name);
	System.out.println("Dept : " +e.dept);
	in.close();
}
}
