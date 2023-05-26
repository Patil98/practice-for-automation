package control_Statement;

public class Example16     //nested_if statement

{
public static void main(String[] args) 

{
	
	 int SA=10500;
	
	if(SA>=1000)
	{
		System.out.println("no charge ");
		
		if (SA>=10000)
		{
			System.out.println("15% flat discount");
		}
		else 
		{
		System.out.println("no discount");	
		}
	}
	
	
	else
	{
		System.out.println("100 RS charge ");
	}
}
}
