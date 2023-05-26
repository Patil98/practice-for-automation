package Bhushan;

public class  duplicate_StringArray1

{

	public static void main(String[] args) 
	{
		
		String  ar[]= {"anil","bhushan","kedar", "anil","bhushan"};
		
		System.out.println("duplicate word in String array is :");
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}
			}
		}
		
	}
}
