package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Example1_ArrayList1 

{
	public static void main(String[] args) {
	
	ArrayList l =new ArrayList();
		
		l.add("bhushan");
		l.add(120);
		l.add("testing");
		l.add(95.6f);
		l.add(null);	
		l.add(null);
		l.add(null);
		
		
		ListIterator a = l.listIterator();

	System.out.println("---traverse collection object  in forward direction----");	

	
	/*	while(a.hasNext())                    //   we can read(retrieve)
		{
			System.out.println(a.next());
		}
		
	/*	System.out.println(l);
	     a.remove();               // we can remove(remove method)
		System.out.println(l);
     */
	 /*  a.set("atul");         //  we can replace(set method) 
	   System.out.println(l);
	
		a.add(500);                //  addition(add method) 
		System.out.println(l);*/
		
		
		
		
		
		
	
		System.out.println("---traverse collection object  in  backword direction----");	
		
      while(a.hasPrevious())
		{
			System.out.println(a.previous());

		}
		


}
}