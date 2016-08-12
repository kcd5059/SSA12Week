package com.tiy.ssa.weektwo.assignmentfour;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {
    

    static final Map<Integer, BigInteger> CACHE = new HashMap<>(); 
    private Factorial()
    {
        
    }
    
    public static BigInteger factorial(int input)
    {
        
        if (input < 0)
            throw new IllegalArgumentException("Input must be greater than 0");
        
        BigInteger result = new BigInteger("1");
        
        if (CACHE.containsKey(new Integer(input)))
            return CACHE.get(new Integer(input));
        else 
        {
            for (int i = input; i > 0; i--) 
            {
                result = result.multiply(new BigInteger(i + ""));
            }
            CACHE.put(new Integer(input), result);
            return result;
        }
    }
}
