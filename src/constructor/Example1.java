package constructor;

public class Example1          // USER DEFINED CONSTRUCTOR ( Example 1 and Example 2 )

{
	//declaration 
	int num1;
	int num2;
	
	//initialize
	Example1()
	{
		num1=45;
		num2=20;
	}
	
	//usage
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void sub()
	{
		System.out.println(num1-num2);
	}
	
 public static void main(String[] args) 
 {
	 Example1 s1= new  Example1();             //user defined variable call from same method  
	 s1.add();
	s1.sub();
	
	System.out.println(".................");
	
	
	Example2 s2 = new Example2();           //user defined variable call from different method
	s2.multi();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
