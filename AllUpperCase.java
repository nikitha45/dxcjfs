
public class AllUpperCase {
	
	boolean isCapsOnly(String data) {
		int flag=1;
		char[] arr=data.toCharArray();
		for(int i=0;i<data.length();i++)		{
			if(!(arr[i]>='A' && arr[i]<='Z'))			{
				flag=0;		
			}					
		}			
		if(flag==1)
			return true;
		else
			return false;			
	}

	public static void main(String[] args) {
		AllUpperCase au = new AllUpperCase();
		boolean bln = au.isCapsOnly("HELLO");
		System.out.println(bln);

	}

}
