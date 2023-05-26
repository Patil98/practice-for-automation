package methods;

public class Example3   //non-static and static regular method call from diff class

{
public static void main(String[] args) 

{
	System.out.println("bhushan patil");
	 Example4 patil = new Example4();
	 patil.exa4();                        //non static method
	patil.exa5();
	
	Example4.exa6();          //static method
	
	
}




}
