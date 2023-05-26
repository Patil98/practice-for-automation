package AccessSpecifier;

public class Example7    // private access specifier  ( Example 7 and 8 )

{
private  int d;

private Example7()
{
	d=7;
}
private  void printsquare()
{
	System.out.println(d*d);
}
public static void main(String[] args) 
{
	Example7 s7 = new Example7();
	System.out.println(s7.d);
	s7.printsquare();
}
}
