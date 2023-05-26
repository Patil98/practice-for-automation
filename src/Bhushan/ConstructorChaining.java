package Bhushan;

public class ConstructorChaining 

{
	ConstructorChaining()
	{
		this(12);
		System.out.println("super class");
	}
	ConstructorChaining(int a)
	{
		this(10,20);
		System.out.println(a*a);
	}
	ConstructorChaining(int a,int b)
	{
		System.out.println(a+b);
	}

}
