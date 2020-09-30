
import java.util.ArrayList;
import java.util.Vector;

	//  map -- key-value key is unique

	// list -- ordered  - allows duplicates

	// set -- unordered- unique

	//collection of elements of type object

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(60);
		marks.add(70);
	
		int x=11;
		marks.add(x);//auto boxing
	
		System.out.println(marks);
	}


}
