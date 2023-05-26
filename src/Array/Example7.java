package Array;

public class Example7

{                                           // 5*4 multi dimensional Array
	public static void main(String[] args) 
	{
		int ar [][]= {{10,20,50,40},{80,30,60,85},{40,25,65,84},{45,85,76,70},{41,46,75,98}};		
	
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}

}
}