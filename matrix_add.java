public class matrix_add 
{
public static void main(String args[])
{
	int a[][] = {{1,3,5}, {2,4,6}, {7,8,9}};
	int b[][] = {{2,3,4}, {1,3,5}, {1,1,6}};
	int c[][] = new int[3][3];
	System.out.println("The resultant matrix is");
	for(int i =0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			c[i][j] = a[i][j] +b[i][j];
			System.out.print(c[i][j] + " ");
		}
		System.out.println();
	}
}
}
