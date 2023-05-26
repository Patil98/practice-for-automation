package control_Statement;

public class Example12   // nested_if _ statement 

{
	
	public static void main(String[] args)
	{
		
	

  int SA=15000;
  
  if(SA>=1000)
  {
	  System.out.println("no delivery charge");
  
	  if(SA>=10000)
{
	System.out.println("15% flat discount");
	
}
else
{
	System.out.println("no discount ");
}

	  }
  
  else
  {
	  System.out.println("100 RS delivery charge");
  }
  }

	}

  