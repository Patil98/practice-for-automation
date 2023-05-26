package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{

	public static void main(String[] args) 
	{
		Vector t=new Vector();
		
		t.add("anil");
		t.add(130);
		t.add(75.5f);
		t.add('A');
		t.add("anil");
		t.add(null);
		t.add(null);
		
		
		System.out.println(t);
		System.out.println(t.get(1));
		System.out.println(t.isEmpty());
		System.out.println(t.contains("anil"));
		System.out.println(t.size());
		
		
		t.add(1, "atul");
		System.out.println(t);
		
		t.remove(1);
		System.out.println(t);
		
//		t.set(1, 140);
//		System.out.println(t);
		
		System.out.println("************");
		
		Iterator e = t.iterator();
		
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		System.out.println("************");
		
		ListIterator s = t.listIterator();
		
	
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		System.out.println("************");
		while(s.hasPrevious())
		{
			System.out.println(s.previous());
		}
		
		
		
		//s.add(500);
		//System.out.println(t);
		
		s.remove();
		System.out.println(t);
		
		
		
		
		System.out.println("************");
		
		for(int i=0; i<t.size(); i++)
		{
			System.out.println(t.get(i));
		}
		System.out.println("************");
		
		for(Object o:t)
		{
			System.out.println(o);
		}
		System.out.println("************");
		
		Enumeration g = t.elements();
		
		while(g.hasMoreElements())
		{
			System.out.println(g.nextElement());
		}
		
	}
	
	
}
