package com.qa.cars;
// https://github.com/SamWhite745/Cars

public class Runner {
	public static void main(String[] args) {
//		Car cheap = new CheapCar();
		System.out.println("Building cars: s");
		Car affordable = new AffordableCar();
		Car luxury= new LuxuryCar();
		System.out.println();
//		Car a = new CheapCar();
//		Car b = new CheapCar();
//		Car c = new CheapCar();
//		Car d = new CheapCar();

		System.out.println("Car noises");
		affordable.noise();
		luxury.noise();
		System.out.println();
				
		CheapCar lada = (CheapCar) CarFactory.buildCar(CarType.CHEAP);
		System.out.println(lada.getWarranty());
		
		
	}
}
