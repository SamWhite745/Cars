package com.qa.cars;

public class LuxuryCar extends Car {
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
    
    @Override
    public void noise() {
    	System.out.println("Puuurrr");
    }
}
