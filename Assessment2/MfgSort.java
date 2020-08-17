package Assessment2;

import java.util.Comparator;

public class MfgSort implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {		
		return o1.getMfgYear() - o2.getMfgYear();
	}

}
