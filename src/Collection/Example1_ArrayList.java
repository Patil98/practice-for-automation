package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Example1_ArrayList 
{


public static void main(String[] args) 
 {
	ArrayList a=new ArrayList();
	a.add("bhushan");
	a.add(120);
	a.add(65.9f);
	a.add('A');
	a.add("bhushan");
	a.add(null);
	a.add(null);
	
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(120));
	System.out.println(a.isEmpty());
	

	
   a.add(2, "anil");
	System.out.println(a);
	
	a.remove(2);
	System.out.println(a);
	
	a.set(2, 69.70f);
	System.out.println(a);
	
System.out.println("********");	

	Iterator i = a.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	//i.remove();
	//System.out.println(a);
	
	System.out.println("********");	
	
	ListIterator l = a.listIterator();
	
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	
	//l.remove();
	//System.out.println(a);
	
//	l.add("atul");
//	System.out.println(a);
	
	System.out.println(a);
	l.set("amol");
	System.out.println(a);
	
	System.out.println("********");	
	
	for(int j=0; j<a.size(); j++)
	{
		System.out.println(a.get(j));
	}
	System.out.println("********");	
	
	for(Object o:a)
	{
		System.out.println(o);
	}
	
	
 }	
}
