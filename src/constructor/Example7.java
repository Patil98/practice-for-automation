package constructor;

public class Example7           //user defined constructor with parameter

{
	int num1;
	int num2;
	
	
	Example7(int a ,int b)
	{
	   num1=a;
	   num2=b;
	   
	}
	
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
		Example7 s1 = new Example7(50,60);
		s1.add();
		s1.mul();
		
		System.out.println("........");
		
		Example7 s2 = new Example7(60,30);
		s2.add();
		s2.mul();
	}
	
	
	
	
	
	
	

}
