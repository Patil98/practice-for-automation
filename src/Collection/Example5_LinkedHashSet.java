package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example5_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet s=new LinkedHashSet();
		
		s.add("anil");
		s.add(126);
		s.add(76.9f);
		s.add('A');
		s.add(126);
		s.add(null);
		s.add(null);
		
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(126));
		
		
		s.add(500);
		System.out.println(s);
		
		System.out.println("*******");
		
		Iterator b = s.iterator();
		
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		
		System.out.println("*******");
		
		for(Object o:s)
		{
			System.out.println(o);
		}
		
		s.clear();
		System.out.println(s);
		
		
		
		
		
	}

}
