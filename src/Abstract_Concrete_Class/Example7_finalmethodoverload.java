package Abstract_Concrete_Class;

public class Example7_finalmethodoverload

{
	
	
	final void m1()
	{
		System.out.println("hello ");
	}
	
	final  void m1(int a)
	{
		System.out.println(a*a);
	}
	
	final  void m1(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		Example7_finalmethodoverload e=new Example7_finalmethodoverload();
		e.m1();
		e.m1(10);
		e.m1(10, 15);
		
	}

}
