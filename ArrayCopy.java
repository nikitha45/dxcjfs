//copying array
public class ArrayCopy {
	public static void main(String[] args) {
	
	int[] x={4,5,8,7,8,8,9,6,5,5};
	
	int[] y=new int[x.length];
	
	for(int i=0;i<x.length;i++){
	y[i]=x[i];
	}
		
	for(int a:y){
	System.out.println(a);
	}
	System.out.println("----------");
	y[2]=500; 
	System.out.println(x[2]);
	System.out.println(y[2]);	
	}
}
