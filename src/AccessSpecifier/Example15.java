package AccessSpecifier;

public class Example15             // private access specifier with 


{
     private   int a;
     private   int b;

  private  Example15()
{
	a=10;
	b=20;
}
 
private   void add()
 {
	 System.out.println(a+b);
 }
 
 public static void main(String[] args)
 {
	Example15 s15 = new Example15();
   s15.add();
	
 }
}
