package casting;

public class DownCasting 

{
	
	public static void main(String[] args)
	
	{
		father f=new son();
		son s=(son)f;
		s.car();
		s.money();
		s.home();
		s.bike();
		
	}

}
