package constructor;

public class Example8           // user defined constructor with parameter ( multiple constructor)


{
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    
    Example8(int a,int b)
    {
    	num1=a;
    	num2=b;
    }
	
    Example8(int c,int d, int e)
	{
		num3= c;
		num4=d;
		num5=e;
	}
    public void add()
    {
    	System.out.println(num1+num2);
    }
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public void sum()
	{
		System.out.println(num3+num4+num5);
	}
	
	public static void main(String[] args) 
	{
		Example8 s1 = new Example8(10,5);
		s1.add();
		s1.mul();
		
		
		Example8 s2 = new Example8(10,15,20);
		s2.sum();
		
		
		
	}
}




