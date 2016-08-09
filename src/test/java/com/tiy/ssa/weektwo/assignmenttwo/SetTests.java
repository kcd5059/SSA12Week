package com.tiy.ssa.weektwo.assignmenttwo;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

public class SetTests {
    
    @Test
    public void fooTests(){
        Set<Foo> f = new HashSet<>();
        assertTrue(f.add(new Foo("kitty")));
        assertTrue(f.add(new Foo("kitty")));
        
    }
    
    @Test
    public void gooTests() {
        Set<Goo> g = new HashSet<>();
        assertTrue(g.add(new Goo("kitty")));
        assertFalse(g.add(new Goo("kitty")));
    }

}
