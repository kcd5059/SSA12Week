package com.tiy.ssa.weekone.assignmentfour;

public class Maths {
	
	public Maths() {
	}

	public static int squareRoot(int toRoot) {
		int base = 2;
		for (; base <= toRoot;) {
		/*	if () {
				break;
			}*/
			base++;
		}
		return base;
	}
	
	public static int cubeRoot(int toRoot) {
		int base = 1;
		
		while (base <= toRoot) {
			if (toRoot / base / base == base) {
				break;
			}
			base++;
		}
		return base;
	}
}
