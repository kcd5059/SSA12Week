package com.tiy.ssa.weektwo.assignmenttwo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserNameImplementation {
    
    static Collection<Name> children(Collection<? extends User> users) {
        Set<Name> children = new HashSet<>();
        for (User u : users) {
            if (u.getAge() < 16) {
                children.add(new Name(u.getFirstName(), u.getLastName()));
            }
            
        }
        return children;
    }
    
    static float adultAverageAge(Collection<? extends User> users) {
        
        float ageSum = 0f;
        Set<User> adults = new HashSet<>();
        
        for (User u : users) {
            if (u.getAge() > 15) {
                adults.add(u);
            }
        }
        
        for (User a : adults) {
            ageSum += a.getAge();
        }
        return (ageSum / adults.size());
    }
}
