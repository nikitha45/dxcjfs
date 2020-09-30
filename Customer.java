
public class Customer {
	
	int cid;
	String cfname;
	String clname;
	long phone;
	static int pin;
	static String addr;
	
	static {
		pin=500007;
		addr="India";
	}
	
	Customer(){
		
	}
	
	Customer(int cid, String cfname, String clname, long phone) {
		this.cid = cid;
		this.cfname = cfname;
		this.clname = clname;
		this.phone = phone;
	}

	
	void display()  {
		System.out.println("Customer Id: "+cid);
		System.out.println("Customer's Firstname: "+cfname);
		System.out.println("Customer's Lastname: "+clname);
		System.out.println("Customer's Phone Number: "+phone);
		System.out.println("Customer's pincode: "+pin);
		System.out.println("Customer's Address: "+addr);			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Customer customer1 = new Customer(100,"Reena","Ree",987654321);
		Customer customer2 = new Customer(101,"Mona","Ron",897654321);
		Customer customer3 = new Customer(102,"Teena","Meena",789654321);
		Customer customer4 = new Customer(103,"Sona","Sony",587694321);
		Customer customer5 = new Customer();

		customer1.display();
		customer2.display();
		customer3.display();
		customer4.display();	
		customer5.display();

	}

}
