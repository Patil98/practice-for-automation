package methods;

public class Example2      //non-static regular method call from same class

{
	public static void main(String[] args) 
	{
		System.out.println("happy shiv jayanti");
		
     Example2 patil = new Example2();
     patil.E2();
	} 
	
 public  void E2()
 {
  System.out.println("good morning velocity");	
}
 
}

