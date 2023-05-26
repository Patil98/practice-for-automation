package Array;

public class Two_Array

{
	
	public static void main(String[] args)
	{
		int ar1 []= {10,15,25,30,35};
		int ar2 []= {10,36,45,30,35};
		
		for(int i=0; i<=4; i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println(ar1[i]+" "+ar2[i]);
			}
		}
		
	}

}
