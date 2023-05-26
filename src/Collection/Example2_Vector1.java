package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector1 
{
	
	public static void main(String[] args) 
	{
		Vector t=new Vector();
		
		t.add("anil");
		t.add(130);
		t.add(75.5f);
		t.add("anil");
		t.add(null);
		t.add(null);
		
		
	System.out.println(t);
	System.out.println(t.size());
	System.out.println(t.isEmpty());
	System.out.println(t.capacity());
	System.out.println(t.get(5));
	
	
  t.remove(2);
  System.out.println(t);
  
  System.out.println("----print data using Iterator cursor----");
	
     Iterator e = t.iterator();
	
	while(e.hasNext())
	{
		System.out.println(e.next());
	}
	

	System.out.println("----print data using ListIterator cursor----");
	
		ListIterator l = t.listIterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		System.out.println("----print data using for Enumeration cursor----");	
		  
		Enumeration er = t.elements();
		
		while(er.hasMoreElements())
		{
			System.out.println(er.nextElement());
		}
		
		System.out.println("----print data using for loop----");
		
		
		for(int i=0; i<t.size(); i++)
		{
			System.out.println(t.get(i));
		}
		
		System.out.println("----print data using for each loop----");
		
		
		for(Object o:t)
		{
			System.out.println(o);
		}
		
		t.clear();
		System.out.println(t.size());

}
}