package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTests {

	@Test
	public void dischargeBatteryTest() {
		
		// Check to ensure subtraction completes if result is valid
		assertEquals("", 75F, new Battery(100F).dischargeBattery(25F), 0);
		// Check to ensure that conditional statement functions (and prevents over discharge)
		assertEquals("", 0F, new Battery(100F).dischargeBattery(101F), 0);
	}
	
	@Test
	public void chargeBatteryTest() {
		// Check to ensure that addition completes if result is valid
		assertEquals("", 100F, new Battery(100F).chargeBattery(25F, 75F), 0);
		// Check to ensure that condition statement functions (and prevents over charge)
		assertEquals("" , 100F, new Battery(100F).chargeBattery(26F, 75F), 0);
	}
	
	@Test
	public void howLongToDischarge() {
		
		// Expect 6000 (minutes), given battery at capacity 100kWh discharging at a rate of 1kw/h
		assertEquals("", 6000, new Battery(100F).howLongToDischarge(100F, 1F), 0);
		// Expect 300 (minutes), given battery at capacity 100kWh discharging at a rate of 20kw/h
		assertEquals("", 300, new Battery(100F).howLongToDischarge(100F, 20F), 0);
		// Expect 345 (minutes), given battery at capacity 23kWh discharging at a rate of 4kw/h
		assertEquals("", 345, new Battery(100F).howLongToDischarge(23F, 4F), 0);
		// Expect 186.66 (minutes),  
		assertEquals("", 186.66, new Battery(100F).howLongToDischarge(56F, 18F), 0.01);
	}

}
