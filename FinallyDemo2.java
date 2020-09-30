

public class FinallyDemo2 {

	int test()
	{		
		try{
			System.out.println(10/2);
			System.out.println("try");
			return 0; // return stop
		}
		catch (Exception e) {
			System.out.println("catch");
			return -1; //return -1 stop
		}
		
		finally {
			System.out.println("hahaha finally i am here bro");
		}	
	}

	public static void main(String[] args) {

		new FinallyDemo2().test();
	}
}
 

// exception Handling
// try catch finally throw throws