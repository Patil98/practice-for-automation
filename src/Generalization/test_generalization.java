package Generalization;

public class test_generalization

{
	public static void main(String[] args) {
		
	
    moto m=new moto();
    m.camera();
    m.sms();
    m.audio();
    m.video();
    m.feature1();
    
    System.out.println("............................");
    
    redmi r=new redmi();
    r.camera();
    r.sms();
    r.audio();
    r.video();
    r.feature3();
    
    System.out.println(".............................");
    
    samsung s=new samsung();
    s.camera();
    s.sms();
    s.audio();
    s.video();
    s.feature2();
    
    
    
	}
}
