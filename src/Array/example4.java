package Array;

import java.util.Arrays;

public class example4 

// int array 

{
public static void main(String[] args) 
{
	int ar[]=new int[5];
	
	ar[0]=30;
	ar[1]=40;
	ar[2]=10;
	ar[3]=20;
	ar[4]=50;
	
	System.out.println(ar.length);  //  5  
	
	System.out.println(ar[2]);         // 10 
	
	System.out.println("---original data--------");
	
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("----ascending order --------");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("------------descending order--------");
	
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
}
}
