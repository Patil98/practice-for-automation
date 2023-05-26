package constructor;

public class Example16

{
	int num1;
	int num2;
  String name ;
  
  Example16(int a,int b)
  {
	  num1=a;
	  num2=b;
  }
  
  Example16(String s1)
  {
	  name=s1;
  }
  public void add()
  {
	  System.out.println(num1+num2);
  }
  
  public void studentname()
  {
	  System.out.println(name);
  }
	public static void main(String[] args)
	
	{
		Example16 s16=new Example16(10,20);
		s16.add();
	
		Example16 s17=new Example16("bhushan");
		s17.studentname();
		
	}

}
