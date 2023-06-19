package typeofvariable;

public class Convert_PrimitiveToString 
{
	
	public static void main(String[] args) 
	{
		// 1st approach
		int i=10;
		String s=Integer.toString(i);
		System.out.println(s+"   "+i);
		
		
		// 2nd approach
		int a=10;
		String s1=String.valueOf(i);
		System.out.println(s1+"   "+a);
	}

}
