package Array;

import java.util.Arrays;

public class int_array 

{
	public static void main(String[] args)
	{
		int ar[]= {10,20,40,60,30,50};
		
		Arrays.sort(ar);
	
//		System.out.println(ar[0]);
//		System.out.println(ar[ar.length-1]);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	
		System.out.println("...................");
		
		for(int j=ar.length-1; j>=0; j--)
		{
			System.out.println(ar[j]);
		}
		
	}
	

}
