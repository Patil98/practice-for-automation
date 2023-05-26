package Bhushan;

import java.util.Arrays;

public class Anagram_string
{
	public static void main(String[] args) 
	{
		String a="SILENT hE";
		String b="He LISTEN";
		
		a=a.replace("//s","");
		b=b.replace("//s", "");
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		
		char x[]=a.toCharArray();
		char y[]=b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean result = Arrays.equals(x, y);
		
		if(result==true)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
				
	}

}
