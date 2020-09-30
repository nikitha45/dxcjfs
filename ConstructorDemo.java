
public class ConstructorDemo {

	int x;

	ConstructorDemo()//  constructor -. to initilize data members
	{
	x=50;
	}

	void disp(){
	System.out.println(x);
	}

	public static void main(String[] args) {
		ConstructorDemo d=new ConstructorDemo(); // constructor is also used to create obj
		d.disp();
		
	}
}