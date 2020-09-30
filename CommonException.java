
//common catch block must be at d end of a catch list

//import java.io.FileOutputStream;

//12
//6
//try catch --> cannot div a num by zero plz provide some other input
//--> dont not use zero in ur input
//book ticket


public class CommonException {

	public static void main(String[] args) {
		
		try{
			int x[]=null;
			System.out.println(10/2);
			System.out.println(x[0]);
			//Class.forName("sdadsa");
		}
		
		catch (ArithmeticException e) {
			System.out.println("divbyzero");
		}
		
		catch (NullPointerException e) {
			System.out.println("null"); 
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array");
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Line 1");
		System.out.println("Line 2");
	}
}


//exception Handling
//try catch finally throw throws
