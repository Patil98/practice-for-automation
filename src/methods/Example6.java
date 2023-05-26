package methods;
                               //method with parameter
public class Example6 


{
    public static void main(String[] args)
    
    {
	m1(20,10);	
    
	Example6 d1 = new Example6();
	d1.m2("bhushan", "patil");	
	
	
	}
    public static void m1( int num1 , int num2)
    {
    	System.out.println(num1+num2);
    	System.out.println(num1-num2);
    	System.out.println(num1*num2);
    	
    }
	public void m2(String fname,String lname)
	{
		System.out.println(fname);
		System.out.println(lname);
	}
}
