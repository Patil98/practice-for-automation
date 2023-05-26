package Array;

public class twoArrayCommonData 
{

	public static void main(String[] args) 
	{
		
		int ar1 []= {10,60,50,40,20,30};
		int ar2 []= {10,60,50,40,10,20};
		
		for(int i=0; i<6; i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println(ar1[i]+" "+ar2[i]);
			}
		}
		
	}
	
}
