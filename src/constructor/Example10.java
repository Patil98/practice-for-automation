package constructor;

public class Example10          //use of multiple constructor 

{
    int num1;
    int num2;
    String name;
    
    Example10(int a, int b)
    {
    	num1=a;
    	num2=b;
    }
	Example10(String s1)
	{
		 name = s1;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public void studentname()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Example10 s2 = new Example10(20,30);
		s2.add();
		s2.mul();
		
		Example10 s3 = new Example10("bhushan patil");
		s3.studentname();
		
		
	}
} 









