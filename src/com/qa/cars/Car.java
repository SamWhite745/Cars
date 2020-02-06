package com.qa.cars;

public abstract class Car {
	private CarType model;
	
    public Car(CarType model) {
        this.setModel(model);
    }    

	public CarType getModel() {
		return model;
	}


	public void setModel(CarType model) {
		this.model = model;
	}

	protected void construct() {
		// TODO Auto-generated method stub
	}
	
	public void noise() {
		
	}
	
}
