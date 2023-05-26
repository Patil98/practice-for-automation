package Bhushan;

public class duplicateCharInString
{
public static void main(String[] args) 
{
	String s="bhushan patil";
	
	char[] h=s.toCharArray();
	
	System.out.print("duplicate char in string is : ");
	
	for(int i=0; i<s.length(); i++)
	{
		for(int j=i+1; j<s.length(); j++)
		{
			if(h[i]==h[j])
			{
				System.out.print(h[j]+" ");
			}
		}
	}
	
	
	
}
}
