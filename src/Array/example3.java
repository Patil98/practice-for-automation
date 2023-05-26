package Array;

public class example3 

{
	public static void main(String[] args) 
	{
		
	
	// 3*4 multi dimensional Array

//  0   1    2     3
//0 10   20   30    80
//1 40   50   60    70
//2  90  110   100   120 
	
	int ar[][]= {{10,20,30,80},{40,50,60,70},{90,110,100,120}};
	
	for(int i=0; i<=2; i++)        // outer for loop --> row
	{
           for(int j=0; j<=3; j++)       // inner for loop-->> column 
           {
        	   System.out.print(ar[i][j]+"  ");
           }
           System.out.println();
	}
	
		
	}
	
	
	
	
	
}
