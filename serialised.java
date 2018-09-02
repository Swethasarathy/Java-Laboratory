import java.io.*;
public class serialised 
{
public static void main(String args[]) throws Exception
{
	employee e = new employee(55, "Swetha", "Team Leader");
	FileOutputStream fout = new FileOutputStream("stud.txt");
	ObjectOutputStream obj = new ObjectOutputStream(fout);
	obj.writeObject(e);
	obj.flush();
	System.out.println("Java Serialisation");
	obj.close();
}
}
