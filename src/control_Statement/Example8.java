package control_Statement;

public class Example8 // nested_if 

{
public static void main(String[] args) 

{
	int SA=850;
	
	if (SA>=500)
	{
		System.out.println("no delivery charge");
		
		if (SA>=1000)
		{
			System.out.println("15% flat offer");
		}
		else
		{
			System.out.println("no offer");
		}
	}
	else 
	{
		System.out.println("100 RS delivery charge");
	}
}
}
