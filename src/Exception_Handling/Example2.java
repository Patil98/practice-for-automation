package Exception_Handling;

public class Example2 
{
	
	public static void main(String[] args) 
	
	{
		
		int ar[]= {1,2,3,4};
		
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled");
		}
		
		System.out.println("hello");
		
		System.out.println("i am bhushan");
			
	}

}
