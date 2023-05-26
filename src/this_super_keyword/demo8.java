package this_super_keyword;

public class demo8 extends demo7
{
	
	int a=20;
	
	public void bhu() 
	{
		int a=50;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		
	}
	
    public static void main(String[] args) 
    {
    	demo8 s=new demo8();
    	s.bhu();
		
	}
	
	

}
