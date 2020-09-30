//handling the exception by the caller

public class CallerException {


public void test()
{
System.out.println(10/0);
}

public static void main(String[] args) {

try{
new CallerException().test();
}
catch (Exception e) {
e.printStackTrace();
}
System.out.println("line 1");

}
}
 

// exception Handling
// try catch finally throw throws
