package AccessSpecifier;

public class Example9          // default access specifier ( Example 9, 10 and 11)

{
int g;

Example9()
{
	g=15;
}
void printsquarenum()
{
	System.out.println(g*g);
}
public static void main(String[] args) 
{
	Example9 s10 = new Example9();
	System.out.println(s10.g);
	s10.printsquarenum();
}
}
