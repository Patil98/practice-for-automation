package Array;

public class Example11_add_two_matrices
{
public static void main(String[] args) 

{
	int a[][]= {{15,14,13},{12,11,10}};
	int b[][]= {{13,18,16},{20,25,30}};	
	
	int c[][]=new int[2][3];
	
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<3; j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+" ");
		}
		
		System.out.println();
		
	}
	
	
}
}
