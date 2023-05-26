package constructor;

public class Example5      // USER DEFINED CONSTRUCTOR WITH PARAMETER (Example 5 and Example 6)

{
	//declaration
	
	int num1;
	int num2;
	
	//initialization

	Example5(int a , int b)
	{
		num1=a;
		num2=b;
	}
	
	//usage
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args)
	{
		Example5 s1 = new Example5(50,10);
		s1.add();
		s1.mul();
	
		System.out.println(".....");
		
		
		Example5 s2 = new Example5(40,30);
		s2.add();
		s2.mul();
		
		System.out.println("........");
		
		Example6 s3 = new Example6(100,50);
		s3.sub();
		
	}
	
	
	
	
	
	
	
	
}
