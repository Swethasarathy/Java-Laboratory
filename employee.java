import java.io.*;
public class employee implements Serializable 
{
int id;
String name;
String dept;
public employee(int id, String name, String dept)
{
	this.id = id;
	this.name = name;
	this.dept = dept;
}
}
