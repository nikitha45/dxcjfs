package Assessment2;

import java.util.Comparator;

public class CarNameSort implements Comparator<Car> {

	@Override
	public int compare(Car n1, Car n2) {		
		return n1.getCarname().compareTo(n2.getCarname());
	}

}
