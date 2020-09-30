
public class Day5 {
	
	String data;
	Day5(String data){
	this.data=data;
	}
	void test(){
	System.out.println(data);
	}
	public static void main(String[] args) {
	Day5[] d=new Day5[5];

	d[0]=new Day5("Hello World");
	d[0].test();


	d[1]=new Day5("My data");
	d[1].test();

	d[2]=d[1];
	d[2].test();


	d[2].data="THINK DIFFERENT";
	d[2].test();  
	d[1].test();

	//  My data different memory for d1 and d2

	// THINK DIFFERENT --> d2 > refs d1 

	}

}
