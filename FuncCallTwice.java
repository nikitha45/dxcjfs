
public class FuncCallTwice {

		int x;
		void init(){
		x=50;
		}
		void disp(){
		System.out.println(x);
		x=60;
		}
		public static void main(String[] args) {
			FuncCallTwice d=new FuncCallTwice();//x=0 
			d.init(); //x=50
			d.disp();// print x(50) -> x=60
			d.disp();// print x(60) ->x=60
			
		}
}