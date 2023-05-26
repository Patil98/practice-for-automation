package Bhushan;

public class Find_Maximum_values_in_int_Array_Without_SortMethod 
{

	public static void main(String[] args) 
	{
		
		int ar[]= {10,20,50,70};
		
		int max=ar[0];
		int min=ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>max)
			{
			   max=ar[i];
			}
			if(ar[i]<min)
			{
			    min=ar[i];
			}
			
		}
		System.out.println("max element in array :"+ max);
		System.out.println("min element in array :"+ min );
		
	}
	
}
