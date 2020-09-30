//Exception Handling

public class Day21 {
	
public static void main(String[] args) {

try{
System.out.println("line 3"+(10/0));// flow stops
}
catch (ArithmeticException e) {
System.out.println("huh ? trying to div the num by zero ? which school bro ?");
System.out.println(e);
}

System.out.println("Line 1");
System.out.println("Line 2");
}
}
 

// exception Handling
// try catch finally throw throws


