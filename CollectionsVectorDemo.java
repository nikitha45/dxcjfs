//Vector Demo

import java.util.Vector;

//map -- key-value key is unique

//list -- ordered  - allows duplicates

//set -- unordered- unique

//collection of elements of type object

public class CollectionsVectorDemo {
	
	public static void main(String[] args) {
	
		Vector v=new Vector();
		v.add("hello");
		
		
		v.add(10);
		v.add(true);
		v.add(10);
		System.out.println(v.size());
		
		v.add("abc");
		
		System.out.println(v.size());
		
		System.out.println(v);
		
		v.insertElementAt("WORLD", 1);
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		System.out.println(v.size());
		
	}

}
