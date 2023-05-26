package Array;

import java.util.Arrays;

public class example1_stringArray 

{
	public static void main(String[] args) 
	{
		
	
	String sr []= new String[5];
	
	
	sr[0]="bhushan";
	sr[1]="anil";
	sr[2]="nikhil";
	sr[3]="aakash";
	sr[4]="harshal";
	
	
	System.out.println(sr.length);       // 5
	
	Arrays.sort(sr);

//	for(int i=0; i<=4; i++)
//	{
//		System.out.println(sr[i]);
//	}
	
	System.out.println("--------ascending order-------");
	
	for(int i=0; i<=sr.length-1; i++)
	{
		System.out.println(sr[i]);
	}
	
	
	System.out.println("----------descending order-------");
	
	for(int i=sr.length-1; i>=0; i--)
	{
		System.out.println(sr[i]);
	}
	}

	}


