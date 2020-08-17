package Assessment2;

import java.util.Date;

public class Car {
	
	private int cid;
	private String Carname;
	private int mfgYear;
	
	public Car(int cid, String carname, int mfgYear) {
		super();
		this.cid = cid;
		Carname = carname;
		this.mfgYear = mfgYear;
	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCarname() {
		return Carname;
	}

	public void setCarname(String carname) {
		Carname = carname;
	}

	public int getMfgYear() {
		return mfgYear;
	}

	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	

	@Override
	public String toString() {
		return "Cars [cid=" + cid + ", Carname=" + Carname + ", mfgYear=" + mfgYear + "]";
	}

	
	public void DisplayCarDetails() {		
		System.out.println("Car Id: "+cid+",  Car Name: "+Carname+",  Manufacturing Year: "+mfgYear);	
	}
	

	public Car() {}
	

}
