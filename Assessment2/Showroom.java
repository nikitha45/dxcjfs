package Assessment2;

import java.util.List;

public class Showroom {
	
	private String name;
	private int ShowroomId;
	
	List<Car> cars;
	
	public Showroom(String name, int showroomId, List<Car> cars) {
		super();
		this.name = name;
		ShowroomId = showroomId;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShowroomId() {
		return ShowroomId;
	}

	public void setShowroomId(int showroomId) {
		ShowroomId = showroomId;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	

	@Override
	public String toString() {
		return "Showroom [name=" + name + ", ShowroomId=" + ShowroomId + ", cars=" + cars + "]";
	}



	public Showroom() {}
	
	


}
