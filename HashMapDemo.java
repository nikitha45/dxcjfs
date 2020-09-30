

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

//collection of elements of type object

// list -- ordered  - allows duplicates

// set -- unordered- unique

//map -- key-value key is unique


/*
 * 1 --- Raj
 * 2  --- Ram
 * 3 --- Raja
 * 4 ---Raju
 *
 *
 */


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap();
		
		hm.put(1, "RAJ");
		hm.put(2, "RAM");
		hm.put(3, "RAJU");
		
		String val= hm.get(3);
		
		System.out.println(val);
		
		
		Set<Integer> keys=hm.keySet();
		Iterator<Integer> itr= keys.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println( itr.next()+ " : "+ hm.get(itr.next()));
			
			int key=itr.next();
			
			System.out.println(key + hm.get(key));
		
		}
		
	}



}