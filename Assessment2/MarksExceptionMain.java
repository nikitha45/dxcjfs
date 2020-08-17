package Assessment2;

public class MarksExceptionMain {

	public static void main(String[] args) {
		
		StudentMarks sm = new StudentMarks();
		
		try {
			sm.ValidateMarks(90);
		} 
		catch (Exception e) {
			System.out.println(e);
		}	
		
	}
}
