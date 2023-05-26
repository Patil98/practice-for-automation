package typeofvariable;

public class Example13         // non static global variable (Exa 13 and 14)

{
	int s=18;      // non static global variable
	
public static void main(String[] args)
{
	Example13 s13 = new Example13();     // non static global variable call from same class
	System.out.println(s13.s);          
	
	
	Example14 s14 = new Example14();    // non static global variable call from diff class
	System.out.println(s14.a);
	System.out.println(s14.b);
}
public void m13()
{
	System.out.println(s);
	
	
}
public static void m14()
{
	Example13 s13 = new Example13();
	System.out.println(s13.s);
	

	
}

}
