package com.tiy.ssa.weektwo.assignmentfour;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class FactorialTests {

    @Test
    public void test() {
        assertEquals(new BigInteger("40320"), Factorial.factorial(8));
        assertEquals(new BigInteger("403291461126605635584000000"), Factorial.factorial(26));
        
        
    }

}
