package collection;

import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[]args)
	{
		LinkedList l = new LinkedList();
		l.add("Durga");
		l.add(123);
		l.add(null);
		l.add(123);
		
		System.out.println(l);
		
		
		//get the Size
		System.out.println(l.size());
		
		//printinfg value particular index
		System.out.println(l.get(2));
		
		//set avalue at a particular index
		l.set(1,"abs");
		
		//Remove a value at a particula index
		l.remove(3);
		System.out.println(l);
		
		//T check a value
		System.out.println(l.contains(123));
		
		//To check if it emty for not
		System.out.println(l.isEmpty());
		
		//To declare l records
		l.clear();
		
		System.out.println(l);
		
	}

}
