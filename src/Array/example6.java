package Array;

public class example6 
{

	//4*4  multi dimensional Array
	
	public static void main(String[] args) 
	{
		
		int ar[][]= {{14,15,20,25},{13,35,57,65},{85,80,75,65,},{54,58,53,59}};
		
		
		
		for(int i=0; i<=3; i++)                     // outer for  Row
		{
			for(int j=0; j<=3; j++)                     // inner for column
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}	
	
}
