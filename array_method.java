public class array_method 
{
static void max(int a[])
{
int max = a[0];
for(int i=0; i<a.length;i++)
	if(max < a[i])
		max = a[i];
	System.out.println("The largest element in the array is " + max);
}
public static void main(String args[])
{
	int arr[] = {15, 30, 45, 60, 75};
	max(arr);
}
}
