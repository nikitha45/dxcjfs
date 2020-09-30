import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BooksCollection {

	public static void main(String[] args) {
		
		HashSet<Book> hs = new HashSet<Book>();
		
		Book b1 = new Book(1150,"Rapunzel", "Grimm");
		Book b2 = new Book(1170,"Thumbelina", "Hans");
		Book b3 = new Book(1190,"Cinderella", "Daisy");			
		Book b4 = new Book(1140,"Snow White", "Wilhelm Grimm,");	
		Book b5 = new Book(1130,"Unforgettable Women", "Khushwant Singh");
		
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		hs.add(b5);

		
//		Iterator<Book> itr = hs.iterator();
//		
//		while(itr.hasNext())
//		{
//			itr.next().dispBook();
//		}		
		
		HashMap<Integer, Book> hm = new HashMap();
		
		hm.put(b1.getIsbn(), b1);
		hm.put(b2.getIsbn(), b2);
		hm.put(b3.getIsbn(), b3);
		hm.put(b4.getIsbn(), b4);
		hm.put(b5.getIsbn(), b5);
			
		
		
		Set<Integer> keys=hm.keySet();
		Iterator<Integer> itr= keys.iterator();
		
		if(args[0].equals("all"))
		{		
//			while(itr.hasNext())		{
//				int key=itr.next();
//				System.out.println(key +" "+ hm.get(key));
//			}	
				
			while(itr.hasNext())		{
				int key=itr.next();
				Book b = hm.get(key);
				b.dispBook();
			}	
		}	
		else {
			Book b = hm.get(Integer.parseInt(args[0]));			
			System.out.println(b);	
		}				
		
		
	}

}
