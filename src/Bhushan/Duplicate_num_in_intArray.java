package Bhushan;

public class Duplicate_num_in_intArray
{
	public static void main(String[] args)
	{
		int  ar[]= {1,2,2,6,5,8,6,3,4};
		
		System.out.println("duplicate num in array :");
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}
			}
		}
		
		
	}

}
