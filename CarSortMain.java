

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Assessment2.Car;
import Assessment2.CarNameSort;
import Assessment2.MfgSort;

public class CarSortMain {

	public static void main(String[] args) {
		
		List<Car> cars11 = new ArrayList<Car>();
		List<Car> cars22 = new ArrayList<Car>();
		List<Car> cars33 = new ArrayList<Car>();
		
		Collections.sort(cars11, new MfgSort());		
		for(Car car:cars11)
		{
			System.out.println("Sorting based on mfg year for Showroom1 "+car);
		}
		System.out.println();
		
//		Collections.sort(cars22, new MfgSort());		
//		for(Car car:cars22)
//		{
//			System.out.println("Sorting on mfg year for Showroom2"+car);
//		}	
//		System.out.println();
//	
//		Collections.sort(cars33, new MfgSort());		
//		for(Car car:cars33)
//		{
//			System.out.println("Sorting on mfg year for Showroom3"+car);
//		}	
//		System.out.println();
		
		
		//----------------
		
		
		Collections.sort(cars11, new CarNameSort());		
		for(Car car:cars11)
		{
			System.out.println("Sorting based on car name for Showroom1 "+car);
		}
		System.out.println();
		
//		Collections.sort(cars22, new CarNameSort());		
//		for(Car car:cars22)
//		{
//			System.out.println("Sorting on car name for Showroom2"+car);
//		}	
//		System.out.println();
//	
//		Collections.sort(cars33, new CarNameSort());		
//		for(Car car:cars33)
//		{
//			System.out.println("Sorting on car name for Showroom3"+car);
//		}	
//		System.out.println();
	

	}

}
