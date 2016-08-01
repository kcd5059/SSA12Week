package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowerTests {

	@Test
	public void powerOfOneTests() {
		assertEquals(1, new Power().powerOfOne(1));
		assertEquals(2, new Power().powerOfOne(2));
		assertEquals(3, new Power().powerOfOne(3));
		assertEquals(4, new Power().powerOfOne(4));
		assertEquals(5, new Power().powerOfOne(5));
	}
	
	@Test
	public void powerOfTwoTests() {
		assertEquals(1, new Power().powerOfOne(1));
		assertEquals(4, new Power().powerOfOne(2));
		assertEquals(8, new Power().powerOfOne(3));
		assertEquals(16, new Power().powerOfOne(4));
		assertEquals(32, new Power().powerOfOne(5));
	}
	
	@Test
	public void powerOfThreeTests() {
		assertEquals(1, new Power().powerOfOne(1));
		assertEquals(8, new Power().powerOfOne(2));
		assertEquals(16, new Power().powerOfOne(3));
		assertEquals(32, new Power().powerOfOne(4));
		assertEquals(64, new Power().powerOfOne(5));
	}
}
