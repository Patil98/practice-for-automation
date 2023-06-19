package Array;

import java.util.Arrays;

public class example1_stringArray 

{
	public static void main(String[] args) 
	{
		
		String ar[]= new String [4];
		
		ar[0]="bhushan";
		ar[1]="anil";
		ar[2]="atul";
	    ar[3]="dheeraj";
	    
	    
	    System.out.println(ar.length);
	    System.out.println(ar[1]);
	    
	    System.out.println("-----print all data-----");
	    
	    for(int i=0; i<ar.length; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
	    Arrays.sort(ar);
	    System.out.println("-----print data in ascending order-----");
	    
	    for(int i=0; i<ar.length; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
	    System.out.println("-----print data in descending order-----");
	    
	    for(int i=ar.length-1; i>=0; i--)
	    {
	    	System.out.println(ar[i]);
	    }
	    
	}
}