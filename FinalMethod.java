
//private final method

//over riding : modifying parents behaviour

//no of args ,type n seq must be same
//return type must be same
//access spcfr -> must be same or higher

//public
//protected
//default
//private
//final
class Animal{	
	private final void move(){                     //private final method
		System.out.println("Animal Move");
	}
}
class Tiger extends Animal{
	public void move(){
		System.out.println("tiger Move");
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.move();	
	}
}
