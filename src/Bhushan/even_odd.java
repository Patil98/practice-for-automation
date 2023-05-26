package Bhushan;

public class even_odd

{
	
	public static void main(String[] args)
	
	{
		int ar[]= {1,2,3,4,7,8,9,10};
		
		int sum=10*11/2;
		
		int actualsum=0;
		
		for(int i=0; i<ar.length; i++)
		{
			actualsum=actualsum+ar[i];
		}
		
		System.out.println("missing num is : "+ (sum-actualsum));
		
		
	}

}
