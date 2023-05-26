package typeofvariable;

public class Example2       //non static global variable  

{
 int c=15;
 int e=25;
 
 
 public static void main(String[] args)
 
 {
	int f=65;    //  local variable call
	System.out.println(f);
	
	
    // 1) non static global  variable call from same class
	 Example2 Exa = new Example2();
	 System.out.println(Exa.c);
	 System.out.println(Exa.e);
	 
	 
	 
	 //2) non static global variable call from diff class
	 Example3 exa = new Example3();
	 System.out.println(exa.d);
	 
}
	
}
