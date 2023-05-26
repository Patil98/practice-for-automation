package control_Statement;

public class Example15   // else_if statement

{

public static void main(String[] args) 

{
	int mark=90;
	
	if(mark>=80)
	{
		System.out.println("distinction");
		
	}
	else if (mark<=80 & mark>=70)
	{
		System.out.println("first clss distinction");
	}
	else if(mark<=70 & mark>=60)
	{
		System.out.println("first class");
	}
	else if (mark<=60 & mark>=40)
	{
		System.out.println("pass");
	}
	
	
}	
	
}
