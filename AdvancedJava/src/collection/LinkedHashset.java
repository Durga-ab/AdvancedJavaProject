package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset 
{
	public static void main(String[]args)
	{
		LinkedHashSet l = new LinkedHashSet();

		//Duplicate not allowed
		//only one null value accept
		//order insertion Maintained
     	HashSet h= new HashSet();
     	l.add("Durga");
     	l.add(123);
     	l.add(null);
     	l.add('a');
     	l.add(123);
     	l.add(null);
     	
     	System.out.println(l);
     	
     	System.out.println(l.size());
     	
     //	System.out.println(l.get(3)); this is undefined for hashset
     	
     	System.out.println(l.contains(123));
     	
     	h.remove(null);
     	System.out.println(l);
     	
     	System.out.println(l.isEmpty());
     	
     	l.clear();
     	System.out.println(h);
     	
	}

}
