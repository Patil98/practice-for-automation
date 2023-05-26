package typeofvariable;

public class Example4          //static global variable


{
 static int a=20;   //-- static global variable 
 
 public static void main(String[] args)
 
 {
	System.out.println(a);
	 m1();
	 
	 Example4 Exa = new Example4();
	 Exa.m2();
	 
	 System.out.println(Example5.c);
	 
	 
 }
 
 public static void m1()
 {
	 System.out.println(a);
	 int b=10;                   //local varable
	 System.out.println(b);
 }
 public void m2()
 {
	 System.out.println(a);
 }
}
