package control_Statement;

public class Example5    //else_if_Example

{
public static void main(String[] args) 

{
	int marks=85;
	
	if (marks>=90)
	{
		System.out.println("first class distinction");
	}
	else if (marks<=90 & marks>=85)
	{
		System.out.println("distinction");
	}
	else if (marks<=85 & marks>=65)
	{
		System.out.println("first clss");
	}
	else if (marks<=65 & marks>=40)
	{
		System.out.println("pass");
	}
	
}
}
