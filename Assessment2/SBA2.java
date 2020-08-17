
package Assessment2;

public class SBA2 {
	
	
	String[] StrBreak(String str) {
		
		String[] arr = str.split(" ");
		return arr;
	}
		
	
	public void StrBreakRev(String str) {
			
			String[] arr = str.split(" ");
			
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=arr[i].length()-1;j>=0;j--)	{
					System.out.print(arr[i].charAt(j) +"");
				}
				System.out.println();
			}								
		}
	
	
	
	public static void main(String[] args) {
		
		SBA2 sba = new SBA2();
		
//		sba.StrBreak("This Is Java Programming");
		
		String[] ss = sba.StrBreak("This Is Java Programming");
		for(String s:ss)
			System.out.println(s);
		
		
		System.out.println();
		
		System.out.println("Reversed String Array");
		sba.StrBreakRev("This Is Java Programming");
		
		
		
	}

}
