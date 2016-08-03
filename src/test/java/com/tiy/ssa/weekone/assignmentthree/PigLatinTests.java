package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTests {

	@Test
	public void translateTests() {
		assertEquals("iway", new PigLatin("I").translate());
		assertEquals("isway", new PigLatin("is").translate());
		assertEquals("ildchay", new PigLatin("child").translate());
		assertEquals("appyhay", new PigLatin("happy").translate());
		assertEquals("Isway appyhay.", new PigLatin("is happy").translate());
		assertEquals("Iway ikelay ickenchay.", new PigLatin("I like chicken").translate());
		assertEquals("Igpay atinlay isway ardhay.", new PigLatin("Pig Latin is hard").translate());
		
	}

}
