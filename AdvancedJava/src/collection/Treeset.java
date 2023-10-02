package collection;

import java.util.TreeSet;

public class Treeset 
{
	public static void main(String[]args)
	{
		//Duplicates are not allowed
		//null values are not allowed
		//insertion value according to default  natural sorting
		//only homogeneous elements are allowed
		
		TreeSet t= new TreeSet();
		t.add(10);
		t.add(30);
		t.add(20);
		
		System.out.println(t);
		
		System.out.println(t.size());
		
		System.out.println(t.isEmpty());
		
//		t.remove(10);
//		System.out.println(t);
		
		System.out.println(t.contains(20));
		
		System.out.println(t.pollFirst());
		
		System.out.println(t.pollLast());
	}

}
