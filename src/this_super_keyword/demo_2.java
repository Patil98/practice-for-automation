package this_super_keyword;

public class demo_2 extends demo_1

{
  int a=20;                  // global variable
  
  public void m1()
  {
	  int a=10;               //local variable
	  System.out.println(a);
	  System.out.println(this.a);
	  System.out.println(super.a);
  }


  
  public static void main(String[] args)
  
  {
	  demo_2 d2 = new demo_2();
		d2.m1();  
  	  
}
}
