package control_Statement;

public class Example25          //else_if statement

{
	public static void main(String[] args) 
	{
		int  marks=90;
		
		if(marks>=85)
		{
			System.out.println("distiction");
		}
		else if(marks<=84 & marks>=75)
		{
			System.out.println("first class");
		}
		else if(marks<=74 & marks>=60)
		{
			System.out.println("second class");
		}
		else if(marks<=59 & marks>=40)
		{
			System.out.println("pass");
		}

	}
	

}
