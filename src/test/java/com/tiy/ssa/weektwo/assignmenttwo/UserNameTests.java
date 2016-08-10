package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserNameTests {

    List<User> userList = new ArrayList<>();
    List<Name> adults = new ArrayList<>();
    List<Name> children = new ArrayList<>();
    
    
    @Before
    public void setup() {
        userList.add(new User("John", "Smith", 14));
        userList.add(new User("Kim", "Miller", 17));
        userList.add(new User("Joss", "Whedon", 42));
        userList.add(new User("Sabrina", "Test", 12));
        userList.add(new User("Johnny", "Quest", 16));
        userList.add(new User("Alan", "Dudeguy", 33));
        
        adults.add(new Name("Kim", "Miller"));
        adults.add(new Name("Joss", "Whedon"));
        adults.add(new Name("Johnny", "Quest"));
        adults.add(new Name("Alan", "Dudeguy"));
        
        children.add(new Name("John", "Smith"));
        children.add(new Name("Sabrina", "Test"));
    }
    
    @Test
    public void Tests() {
        Collection<Name> childrenList = UserNameImplementation.children(userList);
        
        assertTrue(childrenList.containsAll(children));
        assertFalse(childrenList.contains(new Name("Joss", "Whedon")));
        assertFalse(childrenList.contains(new Name("Kim", "Miller")));
        assertFalse(childrenList.contains(new Name("Johnny", "Quest")));
        assertFalse(childrenList.contains(new Name("Alan", "Dudeguy")));
        
        assertEquals(27f, UserNameImplementation.adultAverageAge(userList), 0);
    }
    
    @After
    public void clearUserList() {
        userList.clear();
    }

}
