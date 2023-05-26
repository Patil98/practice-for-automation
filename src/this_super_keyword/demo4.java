package this_super_keyword;

public class demo4 extends demo3

{
 int a=20;

public void m2()
{
	int a=30;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
public static void main(String[] args) 

{
	demo4 m3 = new demo4();
	m3.m2();
	
}
}
