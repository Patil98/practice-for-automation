package AccessSpecifier;

public class Example5      // public access Specifier ( Example 4 , 5 and 6)

{
public int b;

 public Example5()
 {
	 b=20;
 }
 public void m2()
 {
	 System.out.println("public access specifier");
 }
 public static void main(String[] args)
 {
	 Example5 s5 = new Example5();
	 System.out.println(s5.b);
	 s5.m2();
	
}
}
