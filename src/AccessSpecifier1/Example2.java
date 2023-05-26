package AccessSpecifier1;

import AccessSpecifier.Example1;     // protected Access specifiers

public class Example2 extends Example1

{
	public static void main(String[] args) 
	{
		Example2 s2 = new Example2();
		System.out.println(s2.a);
		s2.printcubes();
	}
}
