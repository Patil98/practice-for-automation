package Exception_Handling;

public class Example1 
{
	public static void main(String[] args) {
		

	String s="bhushan";
	
	try
	{
		System.out.println(s.charAt(11));  // risky code
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("exception handled");
	}
	
	System.out.println("hello");
	
	System.out.println("i am bhushan");

}
}
