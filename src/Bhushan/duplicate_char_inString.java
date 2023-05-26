package Bhushan;

public class duplicate_char_inString

{

	public static void main(String[] args) 
	{
		
		String s="example of string char";
		
		char ar[]=s.toCharArray();
		
            System.out.println("the string is : "+ s);
		
		 System.out.print("duplicate char in above string are : ");
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
			if(ar[i]==ar[j])
			{
				System.out.print(ar[j]+" ");
				
			}
				
			}
			
		}
		
		
		
	}
	
}
