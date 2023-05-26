package typeofvariable;

public class Example11 

{
	static int c=10;         // static _global variable       ( Exa 11 and 12)
	
	public void m2()             
	{
		                   
		System.out.println(c);
		
	}
	public static void m3()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
	  System.out.println(c);      //  static _global variable call from same class
		
	  System.out.println( Example12.g);           //  static _global variable call from diff class
		
	  System.out.println(Example12.h);             //  static _global variable call from diff class
	  
	}
	

}
