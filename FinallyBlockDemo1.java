

public class FinallyBlockDemo1 {

	public static void main(String[] args) {
	
		try{
		//open db conn
		//write data to db //table not found
		System.out.println(10/2);
		System.out.println("try");
		//close conn //dont close it here
		}
		catch (Exception e) {
		System.out.println("catch");
		//close conn //dont close it here
		}
		finally {
		System.out.println("finally");
		//close conn // close it here
		}	

	}
}
 

// exception Handling
// try catch finally throw throws
