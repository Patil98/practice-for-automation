package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("bhushan");
		h.add(105);
		h.add(85.9f);
		h.add('B');
		h.add(105);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(105));
		
		h.add(400);
		System.out.println(h);
		
		h.remove(400);
		System.out.println(h);
		
		System.out.println("******");
		
		Iterator v = h.iterator();
		while(v.hasNext())
		{
			System.out.println(v.next());
		}
		
		v.remove();
		System.out.println(h);
		
		System.out.println("******");
		
		for(Object o:h)
		{
			System.out.println(o);
		}
		
		h.clear();
		System.out.println(h);
		
		
	}
	

}
