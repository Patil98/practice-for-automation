package methods;

public class Example9   // method with parameter

{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void multi(int a,int b, int c)
	{
		System.out.println(a*b*c);
	}
	
	public static void main(String[] args) 
	
	{
		Example9 s=new Example9();
		s.add(10, 20);
		s.multi(5, 5, 5);
	}


}
