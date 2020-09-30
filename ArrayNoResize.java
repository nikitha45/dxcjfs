

//resize of array? can it be ?


public class ArrayNoResize {
	
	public static void main(String[] args) {
	
	int[] x={1,2,4,8,9};
	
	System.out.println(x[1]);
	System.out.println("x lenght old "+x.length);
	
	
	x=new int[9];
	System.out.println("x length new "+x.length);
	System.out.println(x[1]); 
	
	}

}
