package Bhushan;

public class ConstructorChaining1 extends  ConstructorChaining 

{
	ConstructorChaining1()
	{
		this(10);
		System.out.println("sub class");
	}
	ConstructorChaining1(int c)
	{
		this(15,20);
		System.out.println(c*c);
	}
	ConstructorChaining1(int f, int g)
	{
		this("bhushan");
		System.out.println(f*g);
	}
	ConstructorChaining1(String s)
	{
		super();
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		ConstructorChaining1 cc = new ConstructorChaining1();
		
	}
	
	

}
