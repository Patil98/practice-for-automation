package Bhushan;

public class duplicates_intAray

{
	public static void main(String[] args) 
	
	{
		int in []= {1,5,2,3,1,2,6};
		
		System.out.println("duplicate char in int array : ");
		
		for(int i=0; i<in.length; i++)
		{
			for(int j=i+1; j<in.length; j++)
			{
				if(in[i]==in[j])
				{
					System.out.println(in[j]+" ");
					
					
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
