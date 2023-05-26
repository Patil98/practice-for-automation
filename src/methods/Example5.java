package methods;

public class Example5  //method with parameter

{
public static void main(String[] args)

{
	System.out.println("bhushan patil");
	
	exa5("bhushan",120);
	Example5 velocity = new Example5();
	velocity.Exa5("anil",130);
}



public static void exa5 (String name , int rollnum )

{
	System.out.println(name+" "+rollnum);
}

public void Exa5(String name,int rollnum)
{
	System.out.println(name+" "+rollnum);
}
}
