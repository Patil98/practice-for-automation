package typeofvariable;

public class Example10 

{
	
	int a=10;       // global variable
	
	public void m1()
	{
		int b=20;       // local variable
	
		System.out.println(b);
		System.out.println(a);
		
	}
	public static void main(String[]args)
	{
		Example10 s10 = new Example10();
          s10.m1();
	}

}
