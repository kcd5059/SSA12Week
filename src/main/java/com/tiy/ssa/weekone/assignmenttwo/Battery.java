package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	// in kWh
	final float capacity;
	// in kWh
	float leftOver;
	
	public Battery(float capacity) {
		this.capacity = capacity;
		this.leftOver = capacity;
	}
	
	float dischargeBattery(float desiredDischarge) {
		
		// Discharge battery while preventing complete discharge
		if ( (capacity - desiredDischarge) > 0 ) {
			return leftOver = capacity - desiredDischarge;
		} else return leftOver = 0;
	}
	
	float chargeBattery(float leftOver, float desiredCharge) {
		// Charge battery while preventing over charge
		if ( (leftOver + desiredCharge) <= capacity ) {
			return leftOver += desiredCharge;
		} else return leftOver = capacity;
	}
	
	// Return (in minutes) time till complete discharge, given current charge (leftOver) and discharge rate (power)
	float howLongToDischarge(float leftOver, float power) {
		return (leftOver / power) * 60;
	}
	
}
