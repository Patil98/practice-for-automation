package Array;

public class Example8 

{                                   // 5*6 multi dimensional Array
	public static void main(String[] args) 
	
	{
  int ar [][]= {{10,50,60,40,80,85},{15,14,19,23,56,98},{47,40,46,48,43,56},{10,85,36,39,43,15},{15,29,38,45,26,56}};
		
  
  for(int i=0; i<=4; i++)       //rows 
  {
	  for(int j=0; j<=5; j++)       // column
	  {
		  System.out.print(ar[i][j]+" ");
	  }
	  System.out.println();
  }
	}

}
