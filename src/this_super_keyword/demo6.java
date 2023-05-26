package this_super_keyword;

public class demo6 extends demo5

{

 int g=60;
	
 public   void m3()
	{
		int g=70;
		System.out.println(g);
		System.out.println(this.g);
		System.out.println(super.g);
	}	

public static void main(String[] args)
	{
		demo6 s6 = new demo6();
		s6.m3();
		
	}
}
