package collection;

import java.util.HashSet;

public class Hashset 
{
	public static void main(String[]args)
	{
		
		//Duplicate not allowed
		//only one null value accept
		//order insertion Random
     	HashSet h= new HashSet();
     	h.add("Durga");
     	h.add(123);
     	h.add(null);
     	h.add('a');
     	h.add(123);
     	h.add(null);
     	
     	System.out.println(h);
     	
     	System.out.println(h.size());
     	
     //	System.out.println(h.get(3)); this is undefined for hashset
     	
     	System.out.println(h.contains(123));
     	
     	h.remove(null);
     	System.out.println(h);
     	
     	System.out.println(h.isEmpty());
     	
     	h.clear();
     	System.out.println(h);
     	
     	
	}

}
