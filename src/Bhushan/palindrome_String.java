package Bhushan;

public class palindrome_String 

{

	public static void main(String[] args) 
	
	{
		String org="level";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
				
		}
		
		if(org.equals(rev))
		{
			System.out.println(org + " is palindrome String");
		}
		else
		{
			System.out.println(org + " is not palindrome String");
		}
			
				
		
		
	}
	
}
