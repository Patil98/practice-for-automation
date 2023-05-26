package Bhushan;

public class Duplicate_char_in_string

{
	public static void main(String[] args)
	
	{
		String s="beautiful beach ";
		
		char[] ar= s.toCharArray();
		
		System.out.println("the string is : " + s);
		
		System.out.println("duplicate char in above string are : ");
		
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1; j<=s.length()-1; j++)
			{
			if(ar[i]==ar[j])	
			{
				System.out.println(ar[j]+" ");
				
			}
				
			}
			
			
			
		}
		
	}
}
