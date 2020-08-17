package Assessment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;



public class ShowroomMain {
	

	
	//3a. implement a functionality to search the  cars in a given showroom based on the showroom name
	
	Map<String, List<Car>> carsection1;

	public void displayByShowroomName1(String name) {
		List<Car> cars = carsection1.get(name);
		
		for(Car car:cars)
		{
					System.out.println(car);
		}	
		System.out.println();
	}
	
	
	//-----------------
	
	
	//3b. allow the user to sort the car based on its  a)manufacture year
	
	Map<String, List<Car>> carsection2;

	public void displayByShowroomName2(String name) {
		List<Car> cars = carsection2.get(name);
		
		System.out.println("ToString meth - sort based on mfg year");
		Collections.sort(cars, new MfgSort());		
		for(Car car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
		
		
		System.out.println("ToString meth - sort based on name");
		Collections.sort(cars, new CarNameSort());		
		for(Car car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
	}
	
	
	//-----------
	
	//3c. create a function to print the car details based on the showroom name and sortType(year/name)
	

	Map<String, List<Car>> carsection3;

	public void displayByShowroomName3(String name) {
		List<Car> cars = carsection3.get(name);
		
		System.out.println("Display meth to sort based on mfg year");
		Collections.sort(cars, new MfgSort());		
		for(Car car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
		
		
		System.out.println("Display meth to sort based on name");
		Collections.sort(cars, new CarNameSort());		
		for(Car car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
	}
	
	
	

	

	public static void main(String[] args) {
		
		Car car1 = new Car(111,"Lamborghini Diablo",2001);
		Car car2 = new Car(112,"Ford F-150 Raptor",1990);
		Car car3 = new Car(113,"Ferrari Testarossa",1998);
		Car car4 = new Car(114,"Porsche 911 Carrera",1994);
		Car car5 = new Car(115,"Suzuki Samurai",1987);
		
		List<Car> cars11 = new Vector<Car>();
		
		cars11.add(car1);
		cars11.add(car2);
		cars11.add(car3);
		cars11.add(car4);
		cars11.add(car5);
		
		Showroom showroom1 = new Showroom("Maruti Suzuki",11,cars11);
		
		
		
		
		
		Car car7 = new Car(211,"Jeep Gladiator",2002);
		Car car8 = new Car(212,"Land Rover Defender",1991);
		Car car9 = new Car(213,"Rolls-Royce",1999);
		Car car10 = new Car(214,"Ferrari 812 Superfast",1995);
		Car car11 = new Car(215,"Jensen Interceptor",1988);
		
		
		List<Car> cars22 = new Vector<Car>();
		
		cars22.add(car7);
		cars22.add(car8);
		cars22.add(car9);
		cars22.add(car10);
		cars22.add(car11);
		
		Showroom showroom2 = new Showroom("Tata",22,cars22);
		
		

		
		
		Car car12 = new Car(311,"McLaren Senna",2003);
		Car car13 = new Car(312,"Ford Cortina",1992);
		Car car14 = new Car(313,"Chevrolet Tornado",2000);
		Car car15 = new Car(314,"Seat Tarraco",1997);
		Car car16 = new Car(315,"Ford Lobo",1989);
		
		
		List<Car> cars33 = new Vector<Car>();
		
		cars33.add(car12);
		cars33.add(car13);
		cars33.add(car14);
		cars33.add(car15);
		cars33.add(car16);
		
		Showroom showroom3 = new Showroom("Nissan",33,cars33);
		
		
		//---------------
		
		ShowroomMain s = new ShowroomMain();
		
		s.carsection1=new HashMap<String,List<Car>>();
		s.carsection1.put(showroom1.getName(), showroom1.getCars());
		s.carsection1.put(showroom2.getName(), showroom2.getCars());
		s.carsection1.put(showroom3.getName(), showroom3.getCars());				
		s.displayByShowroomName1("Tata");	
		
//		s.displayByShowroomName1("Maruti Suzuki");
//		s.displayByShowroomName1("Nissan");
		
		
	
		
		
		s.carsection2=new HashMap<String,List<Car>>();
		s.carsection2.put(showroom1.getName(), showroom1.getCars());
		s.carsection2.put(showroom2.getName(), showroom2.getCars());
		s.carsection2.put(showroom3.getName(), showroom3.getCars());			
		s.displayByShowroomName2("Tata");
		
				
		
		s.carsection3=new HashMap<String,List<Car>>();
		s.carsection3.put(showroom1.getName(), showroom1.getCars());
		s.carsection3.put(showroom2.getName(), showroom2.getCars());
		s.carsection3.put(showroom3.getName(), showroom3.getCars());				
		s.displayByShowroomName3("Tata");
		
	
		
	}

}
