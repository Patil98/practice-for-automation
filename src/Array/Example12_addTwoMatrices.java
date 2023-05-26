package Array;

public class Example12_addTwoMatrices

{
	public static void main(String[] args) 
	
	{
		int a[]= {5,6,7,4};
		int b[]= {7,8,9,15};
		
		int c[]=new int[4];
		
		for(int i=0; i<4; i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		
	}

}
