public class CharEqual {
	boolean myEquals(char fChar, char sChar)
	{	
			
//		if(Character.toLowerCase(fChar)==Character.toLowerCase(sChar)) 
//			return true;	
//		else
//			return false;				
		
	//	if(Math.abs((int)fChar-(int)sChar)==32 || (int)fChar-(int)sChar==0) {
		if(Math.abs(fChar-sChar)==32 || fChar-sChar==0) {
			return true;
		}
		else
			return false;			
	}
	public static void main(String[] args) {
		CharEqual ce = new CharEqual();
		boolean chrEqual = ce.myEquals('b', 'a');	
		System.out.println(chrEqual);
	}

}
