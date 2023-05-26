package methods;

public class Example10 
{
	int num1;
	int num2;
	int num3;
	
	Example10(int a)
	{
		num1=a;
	}
	
	Example10(int a, int b) 
	{
		num1=a;
		num2=b;
	}
	
	public static void add(int a)
	{
		System.out.println(a+a);
	}
	
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		add(10);
		add(20);
		mul(20, 20);
		
	}

}
