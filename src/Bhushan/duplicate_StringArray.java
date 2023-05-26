package Bhushan;

public class duplicate_StringArray 

{
	public static void main(String[] args) 
	{
		String ar[]= {"anil","atul","anil"};
		
		System.out.print("duplicate word in String array : ");
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
               {
					System.out.print(ar[j]+" ");
			   }
						
			}
		}
		
		
		
	}

}
