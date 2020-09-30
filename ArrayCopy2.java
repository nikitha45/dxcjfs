
public class ArrayCopy2 {

		public static void main(String[] args) {

		int[] x={4,5,8,7,8,8,9,6,5,5}; 

		int[] y=new int[x.length];

		System.arraycopy(x,0,y,0,x.length);
		 
		for(int a:y)
		{
		System.out.print(a+", ");
		}

		}
		

}
