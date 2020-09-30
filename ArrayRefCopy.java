

//copy array1 ref copy

public class ArrayRefCopy {
	
	
	public static void main(String[] args) {
	
	int[] x={4,5,8,7,8};
	
	int[] y=x;
	
	y[2]=50;
	System.out.println(y[2]);
	System.out.println(x[2]);
	
	
	}

}
