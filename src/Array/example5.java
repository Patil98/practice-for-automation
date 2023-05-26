package Array;

import java.util.Arrays;

public class example5   // string array 
{
	public static void main(String[] args)
	{
		String ar[]= new String[5];
		
		ar[0]="anil";
		ar[1]="ramesh";
		ar[2]="monu";
		ar[3]="nikhil";
		ar[4]="atul";
		
		System.out.println(ar.length);    // 5
		
		System.out.println(ar[2]);    // monu
	
		System.out.println("-------orignal data---------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-------revers data------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		
		}
		
		Arrays.sort(ar);
		
		System.out.println("------ascending order-----");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		System.out.println("---------descending order------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
	}

}
