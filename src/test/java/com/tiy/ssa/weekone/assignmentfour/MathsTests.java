package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsTests {

	@Test
	public void squareRootTests() {
		assertEquals(5, Maths.squareRoot(25));
		assertEquals(25, Maths.squareRoot(625));
		assertEquals(6, Maths.squareRoot(36));
		assertEquals(12, Maths.squareRoot(144));
		assertEquals(15000, Maths.squareRoot(225000000));
		assertEquals(2, Maths.squareRoot(4));
		assertEquals(3, Maths.squareRoot(10));
		assertEquals(3, Maths.squareRoot(13));
	}
	public void cubeRootTests() {
		/*assertEquals(1, Maths.cubeRoot(1));
		assertEquals(3, Maths.cubeRoot(9));
		assertEquals(5, Maths.cubeRoot(27));
		assertEquals(3, Maths.cubeRoot(9));
		assertEquals(3, Maths.cubeRoot(9));
		assertEquals(3, Maths.cubeRoot(9));
		assertEquals(5, Maths.cubeRoot(9)); */
	}

}
