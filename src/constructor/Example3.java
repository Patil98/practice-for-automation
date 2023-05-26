package constructor;

public class Example3                // USER DEFINED CONSTRUCTOR ( Example 3 and Example 4)

{

	int num3;
	int num4;
	
	
	Example3()
	{
		num3=20;
		num4=10;
		
	}
	
	public void add()
	{
		System.out.println(num3+num4);
	}
	
	public void sub()
	{
		System.out.println(num3-num4);
	}
	
	public static void main(String[] args) 
	
	{
	
		Example3 s1 = new Example3();              // user defined variable call from same method 
		s1.add();
		s1.sub();
		
		System.out.println("..............");
		
		
		Example4 s2 = new Example4();
		s2.mul();
		
		
	}
	
	
	
	
	
	
	
}
