package typeofvariable;

//static global variable 
public class Example1 

{
	static int a=10;
	
	public static void main(String[] args) 
	{
		int b=25;
		System.out.println(25);
		
		System.out.println(a);
		
		m2();
		
		Example1  f= new Example1();
	        f.m1();
		
	}
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void m2()
	{
		System.out.println(a);
	}
}

