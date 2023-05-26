package constructor;

public class Example13             // user defined constructor 
                                      // multiple constructor 

{
	int num1;
	int num2;
	int num3;
	
	Example13(int a,int b)
	{
		num1=a;
		num2=b;
	}

	Example13(int a,int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;	
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void add1()
	{
		System.out.println(num1+num2+num3);
		
		
	}
	
	public static void main(String[] args) 
	{
		Example13 s=new Example13(10,20);
		s.add();
		s.add1();
		
		Example13 s1=new Example13(20,20,20);
		s1.add();
		s1.add1();
	}
	
	
	
	
	
	
	
}
