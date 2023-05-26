package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example6_TreeSet 
{
	public static void main(String[] args) 
	{
		
	 TreeSet t=new TreeSet();
	
	 t.add(100);
	 t.add(105);
	 t.add(102);
	 t.add(104);
	 t.add(103);
	 t.add(101);
	 
	 System.out.println(t);
	 System.out.println(t.size());
	 System.out.println(t.isEmpty());
	System.out.println(t.contains(105));
	
	System.out.println(t.first());
	System.out.println(t.last());
	
	System.out.println(t.pollFirst());
	System.out.println(t);
	
	System.out.println(t.pollLast());
	System.out.println(t);
	
	
	System.out.println("***********");
         Iterator k = t.iterator();
         
         while(k.hasNext())
         {
        	 System.out.println(k.next());
         }
         
         System.out.println("***********");
         
         for(Object o:t)
         {
        	 System.out.println(o);
         }
         
}
}