package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList 
{
	
	public static void main(String[] args) {
		
	LinkedList k=new LinkedList();
	
	k.add("bhushan");
	k.add(125);
	k.add(70.5f);
	k.add('B');
	k.add("bhushan");
	k.add(null);
	k.add(null);
	
	System.out.println(k);
	System.out.println(k.size());
	System.out.println(k.isEmpty());
	System.out.println(k.contains("bhushan"));
	System.out.println(k.get(5));
	
	
//	k.add(3, 400);
//	System.out.println(k);
	
	//k.removeAll(k);
	System.out.println(k);
	
	k.set(1,"atul");
	System.out.println(k);
	
	System.out.println("**********");
	Iterator h = k.iterator();
	while(h.hasNext())
	{
		System.out.println(h.next());
	}
	
	System.out.println("**********");
	
	ListIterator d = k.listIterator();
	
	while(d.hasNext())
	{
		System.out.println(d.next());
	}
	
	System.out.println("**********");
	
	for(int i=0; i<k.size(); i++)
	{
		System.out.println(k.get(i));
	}
	System.out.println("**********");
	
	for(Object o:k)
	{
		System.out.println(o);
	}
}
}