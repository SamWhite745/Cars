package com.qa.cars;

public class AffordableCar extends Car {
    AffordableCar() {
        super(CarType.AFFORDABLE);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
    
    @Override
    public void noise() {
    	System.out.println("brmmmmmmmmm");
    }
}
