package AccessSpecifier;

public class Example3  // protected access specifier

{
public static void main(String[] args) 
{
	Example1 s1 = new Example1();
	System.out.println(s1.a);
	s1.printcubes();
}
}
