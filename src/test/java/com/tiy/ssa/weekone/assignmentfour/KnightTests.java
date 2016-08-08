package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;
import org.junit.Test;

public class KnightTests {

    @Test
    public void locationTests() {
        Knight k = new Knight(new Location(0, 0));
        assertTrue(k.isHome());
        Location after = k.move();
        assertEquals(new Location(1, 2), after);
        Location wentHome = k.goHome();
        assertEquals(new Location(0, 0), wentHome);
        assertTrue(uniquePathTest());
        assertTrue(isLegal());
    }

    public boolean uniquePathTest() {
        Knight k2 = new Knight(new Location(0, 0));
        assertTrue(k2.isHome());
        k2.move();
        k2.goHome();
        // Compare list of positions to ensure they are all unique
        for (int i = 1; i < k2.positions.size() - 1; i++) {
            for (int j = 1; j < i; j++) {
                if (k2.positions.get(i).equals(k2.positions.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isLegal() {

        Knight k3 = new Knight(new Location(0, 0));
        assertTrue(k3.isHome());
        k3.move();
        k3.goHome();

        for (int i = 0; i < k3.positions.size() - 1; i++) {
            int differenceX = Math.abs(k3.positions.get(i + 1).x) - Math.abs(k3.positions.get(i).x);
            int differenceY = Math.abs(k3.positions.get(i + 1).y) - Math.abs(k3.positions.get(i).y);
            // System.out.println(differenceX + ", " + differenceY + ".... i = "
            // + i);
            if ((differenceX > 2) || (differenceY > 2)) {
                return false;
            }
        }
        return true;
    }

}
