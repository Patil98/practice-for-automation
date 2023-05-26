package AccessSpecifier;

public class Example1      // protected Access specifier ( Example 1 ,Example 2 and Example 3 )

{
protected int a;

protected Example1()
{
	a=10;
}

protected void printcubes()
{
	System.out.println(a*a*a);
}
public static void main(String[] args) 
{
	Example1 s1 = new Example1();
	System.out.println(s1.a);
	s1.printcubes();
}
}
