package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTests {

	@Test
	public void helloClassTest() {
		assertEquals(4, new Foo().helloClass());
	}
	
	public void hiClassTest() {
		assertEquals(5, new Foo().hiClass());
	}

}
