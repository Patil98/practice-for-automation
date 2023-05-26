package constructor;

public class Example9            // user defined constructor (multiple constructor) 

{
  int num1;
  int num2;
  
  Example9()
  {
	  num1=10;
	  num2=20;
	  
  }
  
  Example9(int a,int b)
  {
	  num1=a;
	  num2=b;
	  
  }
  
  public void add()
  {
	  System.out.println(num1+num2);
	  
  }
  public void mul()
  {
	  System.out.println(num1*num2);
  }
  
  public static void main(String[] args) 
  {
	Example9 s1 = new Example9();
	s1.add();
	s1.mul();
	
	Example9 s2 = new Example9(30,25);
	s2.add();
	s2.mul();
}
}










