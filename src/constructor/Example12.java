package constructor;

public class Example12      // constructor overloading with /without  parameter


{
	//declare
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    
    //Initialize
    
    Example12()
    {
    	num1=10;
    	num2=20;
    	num3=30;
    }
    Example12(int a,int b,int c,int d,int e)
    {
    	num1=a;
    	num2=b;
    	num3=c;
    	num4=d;
    	num5=e;
     }
    
    public void add()
    {
    	System.out.println(num1+num2+num3);
    }
    
    public void addition()
    {
    	System.out.println(num1+num2+num3+num4+num5);
    }
    
    public static void main(String[] args) 
    {
    	Example12 s13= new Example12();
    	s13.add();
    	s13.addition();
    	
    	Example12 s14 = new Example12(13,13,13,13,13);
    	s14.add();
    	s14.addition();
		
	}
}
