package control_Statement;

public class Example11  //else_if_control statement 


{
public static void main(String[] args) 
{
	int mark=60;
	
	 if(mark>=80)
	 {
		 System.out.println(" first class distiction");
	 }
	 else if(mark<=80 & mark>=70)
	 {
		 System.out.println("distiction ");
	 }
	 else if (mark<=70 & mark>=60)
	 {
		 System.out.println("first class");
	 }
	 else if (mark<=60 & mark>=40)
	 {
		 System.out.println("pass");
	 }
}
}
