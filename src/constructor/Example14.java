package constructor;

public class Example14 
{
	int num1;
	int num2;
	int num3;
	
	Example14(int a ,int b , int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}

	
	public void add()
	{
		System.out.println(num1+num2+num3);
	}
	
	public void mul()
	{
		System.out.println(num1*num2*num3);
	}
	
	public static void main(String[] args) 
	{
		Example14 e=new Example14(10,20,30);
		e.add();
		e.mul();
		System.out.println(e.num1);
		
		
	}
}
