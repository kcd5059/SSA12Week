package com.tiy.ssa.weekone.assignmentone;

public class Thermometer {
	
	int temperature;
	boolean isFahrenheit;
	
	public Thermometer(int temperature, boolean isFahrenheit) {
		
		this.temperature = temperature;
		this.isFahrenheit = isFahrenheit;
	}
	
	public int convertTemp(boolean isFahrenheit) {
		
		if (isFahrenheit) {
			return (temperature - 32) * 5 / 9;
		} else {
			return (temperature * 9) / 5 + 32;
		}
		
	}
	
	/*
    public void display(boolean isFahrenheit) {
		System.out.println(temperature);

	}
	*/
}
