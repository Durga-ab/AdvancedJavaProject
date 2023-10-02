package collection;

import java.util.Vector;

public class VectorList 
{
	public static void main(String[]args)
	{
		Vector v = new Vector();
		v.add('w');
		v.add("Durga");
		v.add(123);
		v.add(null);
		v.add("Durga");
		v.add(null);
		
		System.out.println(v);
		
		//get the size
		System.out.println(v.size());
		
		System.out.println(v.get(2));
		
		//set a value at a particulae index
		v.set(3, "abc");
		
		//Remove a value at a particular index
		v.remove(4);
		
		//to check a value
		System.out.println(v.contains(null));
		
		//to check if it is empty or not
		System.out.println(v.isEmpty());
		
		//to declare v records
		v.clear();
		System.out.println(v);
	}

}
