package com.qa.cars;

public class CarFactory {
	
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case CHEAP:
            car = new CheapCar(true);
            break;
 
        case AFFORDABLE:
            car = new AffordableCar();
            break;
 
        case LUXURY:
            car = new LuxuryCar();
            break;
 
        default:
            // throw invalidCar exception
            break;
        }
        return car;
    }
}
