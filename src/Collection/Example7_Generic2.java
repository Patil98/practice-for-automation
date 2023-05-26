package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Example7_Generic2
{
	public static void main(String[] args) 
	{
		
   HashSet<String> a=new HashSet<String>();
	
	a.add("bhushan");
	a.add("amol");
	a.add("atul");
	
	for(String s:a)
	{
		System.out.println(s);
	}
System.out.println("***********");	
	Iterator<String> r = a.iterator();
	while(r.hasNext())
	{
		System.out.println(r.next()+" ");
	}
}
}