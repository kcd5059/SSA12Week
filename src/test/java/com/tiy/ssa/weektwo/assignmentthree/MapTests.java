package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

public class MapTests {

    
    @Before
    public void setup() 
    {
        Map<SocialSecurityNumber, User> practiceMap = new HashMap<>();    
        practiceMap.put(new SocialSecurityNumber("111223333"), (new User("Kyle", "Deen")));
        assertEquals(new User("Kyle", "Deen"), practiceMap.get(new SocialSecurityNumber("111223333")));
    }
    
    @Test
    public void initial() 
    {
        Map<SocialSecurityNumber, User> map = new HashMap<>();
        User user = new User("Aristotle", "Plato");
        map.put(new SocialSecurityNumber("123456789"),  user);
        assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
        
        User removed = map.remove(new SocialSecurityNumber("123456789"));
        assertEquals(user, removed);
    }
    /*
    for (Entry entry : map.entrySet()) {
       //Loops through each entry in Map 
    }*/

}
