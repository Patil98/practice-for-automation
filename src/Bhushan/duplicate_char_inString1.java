package Bhushan;

public class duplicate_char_inString1 
{

	public static void main(String[] args) 
	{
		String s= "bhushanpatil";
		
		char ar[] = s.toCharArray();
	
		System.out.println("duplicate char in string : ");
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}
			}
				
		}
		
		
	}
}
