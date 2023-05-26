package loops;

public class Example31 

{
	public void m1()
	{
		for(int a=1; a<=10; a++)
		{
			System.out.println(a);
		}
	}
    
	public void m2()
	{
		for(int b=11; b<=20; b++)
		{
			System.out.println(b);
		}
	}
	public void m3()
	{
		for (int c=30; c>=21; c--)
		{
			System.out.println(c);
		}
	}
	
	public static void main(String[] args)
	{
		Example31 e =new Example31();
		e.m1();
		e.m2();
		e.m3();
	}
}
