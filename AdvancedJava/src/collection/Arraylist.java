package collection;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[]args)
	{
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add('%');
		a.add("ABC");
		a.add('D');
		a.add(100);
		a.add(null);
		a.add(null);
		
		//Print all the values
		System.out.println(a);
		
		//Get The Size
		System.out.println(a.size());
		
		//printing value at a Particular Index
		System.out.println(a.get(2));
		
		//Set a value at a particular Index
		a.set(4, "XYZ");
		
		//remove a value at a particular index
		a.remove(5);
		System.out.println(a);
		
		//To Check a value
		System.out.println(a.contains('D'));
		
		//To Check if it is Empty for not
		System.out.println(a.isEmpty());
		
		//To delete All records
		a.clear();
		
		System.out.println(a);
		
	}

}
