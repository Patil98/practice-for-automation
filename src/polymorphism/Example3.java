package polymorphism;

public class Example3   // method overloading

{
	public void main()
	{
		System.out.println("bhushan");
	}
	
	public void main(int a)
	{
		System.out.println(a*a);
	}
	public void main(int a,int b)
	{
		System.out.println(a*b);
	}
	
	
	
	public static void main(String[] args) 
	{
		Example3 e= new Example3();
		e.main();
		e.main(10);
		e.main(10,20);
		
	}

}
