package com.qa.cars;

public class Runner {
	public static void main(String[] args) {
		Car a = new CheapCar();
		Car b = new CheapCar();
		Car c= new CheapCar();
		Car d = new CheapCar();
		
		a.noise();
		b.noise();
		c.noise();
		d.noise();

		
//		CarFactory cf = new CarFactory();
//		Car luxCar = cf.buildCar(CarType.LUXURY);
		
		
	}
}
