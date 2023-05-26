package control_Statement;

public class Example26  //nested_if condition

{
public static void main(String[] args) 

{
	int SA=800;
	
	if(SA>=500)
	{
		System.out.println("no delivery charge");
		
	if(SA>=10000)
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
		System.out.println("50 delivery charge");
	}
	
}
}
