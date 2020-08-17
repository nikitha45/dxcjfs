package Assessment2;



public class StudentMarks {
	
	public void ValidateMarks(int marks) throws MarksOutOfRangeException
	{
		if(!(marks>=0 && marks<=100))
			throw new MarksOutOfRangeException();
		else
			System.out.println("Provided marks, "+marks+ " is valid!");
	}

}
