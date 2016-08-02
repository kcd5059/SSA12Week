package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTests {

	@Test
	public void testDisplay() {
		
		/* first parameter is the EXPECTED result if the method is properly functioning, 
		 * second parameter (constructor) is the ACTUAL result of  the method being tested */
		assertEquals(25, new Thermometer(78, true).display(false));
		assertEquals(212, new Thermometer(100, false).display(true));
		assertEquals(355, new Thermometer(672, true).display(false));
		assertEquals(150, new Thermometer(150, true).display(true));
		assertEquals(175, new Thermometer(175, false).display(false));
	}
	
	@Test
	public void integerDivision() {
		assertEquals("", 1, 9/5);
	}

}
