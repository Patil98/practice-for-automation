package control_Statement;

public class Example7 //nested_if_statement

{
public static void main(String[] args) 
{
    
	int SA=350;
	
	if(SA>500)
	{
		System.out.println("no DL charge");
		
		if(SA>1000)
		{
			System.out.println("10% add discount");
		}
		else
		{
			System.out.println("no discount");
		}
		
	}
	else
	{
		System.out.println("50 rs DL charge");
	}
}
}
