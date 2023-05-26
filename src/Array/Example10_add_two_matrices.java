package Array;

public class Example10_add_two_matrices 

{

	public static void main(String[] args) 
	{
		int a[][]= {{8,9,6},{23,24,26},{10,20,30}};
		int b[][]= {{14,18,11},{57,62,36},{15,25,35}};
		
		int c[][]=new int[3][3];
		
		for(int i=0; i<3; i++)
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
