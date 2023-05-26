package Bhushan;

public class duplicates_word_in_string 

{
	public static void main(String[] args) 
	{
		String [] s = {"bhushan","anil", "bhushan"};
		
		System.out.print("duplicate word in String array : ");
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[j]+" ");
				}
				
			}
		}
		
	}

}
