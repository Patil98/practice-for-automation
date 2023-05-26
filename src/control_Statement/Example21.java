package control_Statement;

public class Example21   //nested_if 

{
public static void main(String[] args) 
{
	int SA=200;
	
	if(SA>500)
	{
		System.out.println("no delivery charge ");
		
   if(SA>10000)
   {
	   System.out.println("20% flat discount");
   }
   else
   {
	   System.out.println("no discount");
   }
	}
	else 
	{
		System.out.println("150 RS delivery charage ");
	}
	
	
}	

}
