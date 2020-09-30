
public class equalsIgnoreString {
	
	boolean isEqual(String str1, String str2)  {
		
		if(str1.equalsIgnoreCase(str2))
		{
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		equalsIgnoreString es = new equalsIgnoreString();
		boolean bln = es.isEqual("hello", "Hello");
		System.out.println(bln);	
	}
}
