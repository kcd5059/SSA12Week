package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTests {

	@Test
	public void dischargeBatteryTest() {
		
		// Check to ensure subtraction completes if result is valid
		assertEquals("", 75F, new Battery(100F).discharge(25F), 0);
		// Check to ensure that conditional statement functions (and prevents over discharge)
		assertEquals("", 0F, new Battery(100F).discharge(101F), 0);
	}
	
	@Test
	public void chargeBatteryTest() {
		// Check to ensure that addition completes if result is valid
		assertEquals("", 100F, new Battery(100F).charge(25F), 0);
		// Check to ensure that condition statement functions (and prevents over charge)
		assertEquals("" , 100F, new Battery(100F).charge(26F), 0);
	}
	
	@Test
	public void howLongToDischarge() {
		//Create new instance of Battery with a charge of 100F, called b
		Battery b = new Battery(100f);
		assertEquals(100 * 60, b.howLongToDischarge(1F));
		assertEquals(50f, b.discharge(50f), 0);
		assertEquals(50 * 60, b.howLongToDischarge(1F));
		assertEquals(23F, b.discharge(77F), 0);
		assertEquals(345, b.howLongToDischarge(4F), 0);
		assertEquals(56F, b.charge(33F), 0);
		assertEquals(186, b.howLongToDischarge(18F), 0);
	}

}
