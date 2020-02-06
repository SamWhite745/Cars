package com.qa.cars;

public class CheapCar extends Car {
	private boolean warranty;
	
    CheapCar(boolean warranty) {
        super(CarType.CHEAP);
        this.setWarranty(warranty);
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

	public boolean getWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}
}
