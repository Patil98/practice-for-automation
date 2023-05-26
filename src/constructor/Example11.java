package constructor;

public class Example11         // constructor overloading with parameter

{
    // declare
	
	int num1;
	int num2;
	int num3;
	int num4;
	
	// initialization
	
	Example11(int a , int b)
	{
		num1=a;
		num2=b;
	}
	Example11(int a ,int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	Example11(int a,int b,int c,int d)
	{
		num1=a;
		num2=b;
		num3=c;
	    num4=d;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public void addition()
	{
		System.out.println(num1+num2+num3);
	}
	public void multiplication()
	{
		System.out.println(num1*num2*num3);
	}
	public void add1() 
	{
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void main(String[] args) 
	{
		Example11 s11 = new Example11(10,15);
		s11.add();
		s11.mul();
		s11.addition();
		s11.add1();
	
		
	Example11 s12 = new Example11(25,25,25);
	s12.addition();
    s12.multiplication();
    
    Example11 s13 = new Example11(12,12,12,12);
    s13.add1();		
    	
    		
		
	}
	
}
