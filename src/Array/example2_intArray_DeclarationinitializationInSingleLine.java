package Array;

import java.util.Arrays;

public class example2_intArray_DeclarationinitializationInSingleLine 

{
public static void main(String[] args)

{
	int in[]= {10,50,30,40,20};
	
	
	
//	System.out.println(in.length);        //5
//	System.out.println(in[3]);
//	
	
	Arrays.sort(in);
	
	for(int i=0; i<=in.length-1; i++)
	{
		System.out.println(in[i]);
	}
	
	System.out.println("----------revers array--------");
	
	for(int i=in.length-1; i>=0; i--)
	{
		System.out.println(in[i]);
	}
}
}