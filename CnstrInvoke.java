//constructor invoking

//child cannot inhrt pvt n costr

class Calc1{
	/* public Calc(){
	System.out.println("parent const");
	}
	*/

		public Calc1(int x){
			System.out.println("parent args const");
	}
}
class SciCalc1 extends Calc1{
	public SciCalc1(){
		super(50);//super()
		System.out.println("Child const");
	}
}
	
public class CnstrInvoke {
	public static void main(String[] args) {
		SciCalc1 sc=new SciCalc1();
	
	}
}



