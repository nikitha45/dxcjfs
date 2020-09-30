//Blank final variable re initializing in constructor

//final -> var method class
//final int x; // x=0;
public class BlnkFinalVar {

	final int x;
	public BlnkFinalVar() {
		x=50;
	}
	
	void abc()
	{	
		System.out.println(x);	
	}

	public static void main(String[] args) {

		new BlnkFinalVar().abc();
	}

}
