package com.qa.cars;

public class CarFactory {
	
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case CHEAP:
            car = new CheapCar();
            break;
 
        case AFFORDABLE:
            car = new AffordableCar();
            break;
 
        case LUXURY:
            car = new LuxuryCar();
            break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }
}
