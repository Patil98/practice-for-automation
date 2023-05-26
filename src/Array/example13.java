package Array;

import java.util.Arrays;

public class example13
{
	
	public static void main(String[] args) 
	{
		
		int ar[]=new int [5];
		
		ar[0]=1;
		ar[1]=5;
		ar[2]=4;
		ar[3]=2;
		ar[4]=3;
		
		
		Arrays.sort(ar);
		
		System.out.println("---print in acsending order--");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---print in dicsending order--");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
