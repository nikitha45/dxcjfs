
//final -> var method class
// final int x; // x=0;
public class FinalVar {

	final int x=10;
	//final int y; no def va;l for final var
	void abc()
	{
	//x=50; error cannot re init final var
	
	System.out.println(x);

}

public static void main(String[] args) {

	new FinalVar().abc();
	}

}
