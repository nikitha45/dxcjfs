

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Assessment2.Car;
import Assessment2.CarNameSort;
import Assessment2.MfgSort;

public class CarSortMain1 {

	public static void main(String[] args) {
		
		
		List<Car> cars11 = new ArrayList<Car>();
		
		Car car1 = new Car(111,"Lamborghini Diablo",2001);
		Car car2 = new Car(112,"Ford F-150 Raptor",1990);
		Car car3 = new Car(113,"Ferrari Testarossa",1998);
		Car car4 = new Car(114,"Porsche 911 Carrera",1994);
		Car car5 = new Car(115,"Jensen Interceptor",1847);
		
		cars11.add(car1);
		cars11.add(car2);
		cars11.add(car3);
		cars11.add(car4);
		cars11.add(car5);
		
		Collections.sort(cars11, new MfgSort());		
		
		for(Car car:cars11)
		{
			System.out.println(car);
		}
		
		System.out.println();
		
		Collections.sort(cars11, new CarNameSort());		
			
			for(Car car:cars11)
			{
				System.out.println(car);
			}
		
		
	}

}
