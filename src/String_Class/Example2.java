package String_Class;

public class Example2

{
	
	public static void main(String[] args)
	{
		String s1= "ratnagiri";
		String s2= "i love my india";
		String s3="abcd";
		String s4="ABCD";
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.contains("if"));
	
		System.out.println(s2.substring(10));
	
		System.out.println("------------------------");
		
		System.out.println(s3.concat(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
		
	System.out.println("-----------------------");	
	
	String ar []= s1.split("a");
	
	System.out.println(ar.length);
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	
		
	}

	
}
