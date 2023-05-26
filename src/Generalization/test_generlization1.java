package Generalization;

public class test_generlization1 

{

	public static void main(String[] args) 
	
	{
		
		car c=new tata();
		c.speedlimit();
		c.fuelcapacity();
		c.colour();
		
		System.out.println("..................");
		
		car s=new bmw();
		s.speedlimit();
		s.fuelcapacity();
		s.colour();
		
		System.out.println("...............");
		
		car d=new lamborgini();
		d.speedlimit();
		d.fuelcapacity();
		d.colour();
		
	}
	
	
}
