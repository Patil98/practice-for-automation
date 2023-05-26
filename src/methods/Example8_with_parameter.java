package methods;

public class Example8_with_parameter 

{
	public void m1(int num1,int num2,float num3,float num4)
	{
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		System.out.println(num1-num2);
		System.out.println(num3/num4);
	}
	

	public static void main(String[] args)
	{
		Example8_with_parameter s1 = new 	Example8_with_parameter();
		s1.m1(15,10,4.5f,5.5f);
		s1.m1(20, 15, 20.5f, 40.5f);
	}
}
