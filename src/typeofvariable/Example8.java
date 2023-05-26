package typeofvariable;

public class Example8           //non static global variable call from same and diff class

{
int a=23;

public static void main(String[] args)
{
	
	Example8 patil = new Example8();
       System.out.println(patil.a);      //non static global variable call from same class
       patil.m4();
       
       
       
       Example9 anil = new Example9();
       System.out.println(anil.b);         //non static global variable call from diff class
}

public void m4()
{
	System.out.println(a);
}
}
