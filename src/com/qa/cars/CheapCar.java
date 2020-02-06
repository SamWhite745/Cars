package com.qa.cars;

public class CheapCar extends Car {
	
	//private boolean warranty = false;
	
    CheapCar() {
        super(CarType.CHEAP);
//        this.warranty = warranty;
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building cheap car");
    }
    
    @Override
    public void noise() {
    	System.out.println("CLANK");
    }
}
