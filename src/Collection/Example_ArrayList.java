package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example_ArrayList 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> a=new ArrayList<Integer>
		(Arrays.asList(1,2,10,10,1,3,4,5,6,2,1,5));
		
		HashSet<Integer> li=new HashSet<Integer>(a);
		System.out.println(li);
	
		//ArrayList<Integer> a1=new ArrayList<Integer>(li);
		
		//System.out.println(a1);
		
	}

}
