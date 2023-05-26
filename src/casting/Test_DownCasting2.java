package casting;

public class Test_DownCasting2

{
	
public static void main(String[] args)
{
	Father2 f1=new Son2();
	Son2 s2=(Son2)f1;
	
	s2.farm();
	s2.home();
	s2.money();
	s2.car();
	
	
}
}
