package typeofvariable;

public class Example6         //  static global  variable call from same class and different class

{
	static int B=6;
	
public static void main(String[] args)

{
	System.out.println(B);
	
	m1();      //static method call  
	m2();
  
	Example7 b=new Example7();
	System.out.println(b.g);
	
   System.out.println(Example7.h);
	
	Example6 bhu = new Example6();
	bhu.m3();
}

public static void m1()
{
	System.out.println(B);
  
     int C =10;
	System.out.println(C);
}


public static void m2()
{
	 int D=30;
	
	System.out.println(D);
	System.out.println(B);
}

public void m3()
{
	int F=50;
	System.out.println(B);
	System.out.println(F);
}
	


}
