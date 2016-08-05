package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnightTests {

	@Test
	public void Tests() {
		
		// These tests only pass if case 1 is met
		Knight t1 = new Knight(0, 0);
		t1.move();
		t1.move();
		assertEquals("4, 2", t1.getPosition());
		assertEquals(2, t1.howManyToStart());
		assertEquals("0, 0", t1.getStart());
		
		
		// These tests only pass if case 
		Knight t2 = new Knight(0, 0);
		t2.move();
		t2.move();
		t2.move();
	}

}
