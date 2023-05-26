package constructor;

public class Example15 
{
	int num1;
	int num2;
	int num3;
	
	Example15()
	{
		num1=25;
		num2=30;
		num3=40;
	}

	public void add() 
	{
		System.out.println(num1+num2+num3);
	}
	
	public void mul()
	{
		System.out.println(num1*num2*num3);
	}
	
	public static void main(String[] args) 
	{
		Example15 e1 =new Example15();
		e1.add();
		e1.mul();
		
		
    }
}
