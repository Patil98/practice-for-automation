package control_Statement;

public class Example20        // else_if statement

{
	
	public static void main(String[] args) 
	
	{
		int marks=100;
		
		if(marks>=80)
		{
			System.out.println("distiction");
		}
		else if(marks>=70 & marks<=79)
			{
				System.out.println("first class");
			}
	   else if(marks>=60 & marks<=69)
	   {
		   System.out.println("second class");
	   }
	   else if(marks>=40 & marks<=59)
	   {
		   System.out.println("pass");
	   }
		
		
		
	

	}
}
