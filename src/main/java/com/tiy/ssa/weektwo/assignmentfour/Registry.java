package com.tiy.ssa.weektwo.assignmentfour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Registry {
    
    final Map<SocialSecurityNumber, Person> reg = new HashMap<>();

    public boolean add(Person person)
    {
        if (reg.containsValue(person.ssn))
        {
            return false;
        }
        else
        {
            reg.put(person.ssn, person);
            return true;
        }
    }
    
    public Person progenitor(SocialSecurityNumber ssn)
    {   
        Person subject = reg.get(ssn);
        List<Person> ancestors = ancestors(ssn);
        Person progenitor = ancestors.get(0);
        
        if ( (subject.parentI == null) && (subject.parentII == null) )
        {
            return subject;
        } 
        
        for (int i = 1; i < ancestors.size(); i++)
        {
                LocalDate ydBirth = progenitor.getBirth();
                LocalDate compareBirth = ancestors.get(i).getBirth();
                if (compareBirth.isBefore(ydBirth))
                {
                    progenitor = ancestors.get(i);
                }
        }
        return progenitor;
    }
    
    /*public Person oldestLivingRelative(SocialSecurityNumber ssn)
    {
    }*/
    
    public List<Person> ancestors(SocialSecurityNumber ssn)
    {
        Person startP = reg.get(ssn);
        List<Person> ancestors = new ArrayList<>();
        List<Person> toProcess = new ArrayList<>();
        
        toProcess.add(startP);
        
        while (!toProcess.isEmpty())
        {
            List<Person> processNext = new ArrayList<>(); 
            for (Person current : toProcess) 
            {
                if ( !(current.getParentI() == null) )
                {
                    ancestors.add(current.getParentI());
                    processNext.add(current.getParentI());
                }
                if ( !(current.getParentII() == null))
                {
                    ancestors.add(current.getParentII());
                    processNext.add(current.getParentII());
                }
                toProcess = processNext;
            }
        }
        return ancestors;
        
    }
    public List<Person> descendants(SocialSecurityNumber ssn)
    {
        Person startP = reg.get(ssn);
        List<Person> descendants = new ArrayList<>();
        List<Person> toProcess = new ArrayList<>();
        
        toProcess.add(startP);
              
        while (!toProcess.isEmpty())
        {
            List<Person> processNext = new ArrayList<>();
            for (Person current : toProcess) {
                if (!current.children.isEmpty())
                {
                    descendants.addAll(current.getChildren());
                    processNext.addAll(current.getChildren());
                }
            }
            toProcess = processNext;
        }
        return descendants;
        
    }
    
    public Person youngestDescendant(SocialSecurityNumber ssn)
    {
        Person startP = reg.get(ssn);
        List<Person> descendants = descendants(ssn);
        Person youngestDescendant = descendants.get(0);
        
        if (startP.children.isEmpty())
        {
            return startP;
        } 
        
        for (int i = 1; i < descendants.size(); i++)
        {
                LocalDate ydBirth = youngestDescendant.getBirth();
                LocalDate compareBirth = descendants.get(i).getBirth();
                if (compareBirth.isAfter(ydBirth))
                {
                    youngestDescendant = descendants.get(i);
                }
        }
        return youngestDescendant;
    }
    
    public boolean areRelated(SocialSecurityNumber one, SocialSecurityNumber two)
    {
        List<Person> ancestors = ancestors(one);
        List<Person> descendants = descendants(one);
        
        if ( (ancestors.contains(reg.get(two))) || (descendants.contains(reg.get(two))) ) {
            return true;
        } else
        {
            return false;
        }
    }
    
    public Person get(SocialSecurityNumber ssn)
    {
        return reg.get(ssn);
    }
    
    /*public Relationship related(SocialSecurityNumber one, SocialSecurityNumber two)
    {
        
    }*/
    
    public List<Person> getGrandparents(SocialSecurityNumber ssn)
    {
        List<Person> grandparents = new ArrayList<>();
        List<Person> parents = reg.get(ssn).getParents();
        
        for (Person parent : parents){
            List<Person> parentsParents = parent.getParents();
            
            for (Person pps : parentsParents)
            {
                grandparents.add(pps);
            }
        }
        return grandparents;
    }
    
    public List<Person> getGrandchildren(SocialSecurityNumber ssn)
    {
        List<Person> grandchildren = new ArrayList<>();
        List<Person> children = reg.get(ssn).getChildren();
        
        for (Person child : children){
            List<Person> childrensChildren = child.getChildren();
            
            for (Person ccs : childrensChildren)
            {
                grandchildren.add(ccs);
            }
        }
        return grandchildren;
    }
    
    public List<Person> getSiblings(SocialSecurityNumber ssn)
    {   
        return reg.get(ssn).parentI.getChildren();
    }
    
    public List<Person> getNiblings(SocialSecurityNumber ssn)
    {
        List<Person> siblings = getSiblings(ssn);
        List<Person> niblings = new ArrayList<>();
        
        for (Person sibling : siblings)
        {
            List<Person> children = sibling.getChildren();
            for (Person nibling : children)
            {
                niblings.add(nibling);
            }
        }
        
        return niblings;
    }
    
//    public List<Person> getAuncles(SocialSecurityNumber ssn)
//    {
//        List<Person> parents = reg.get(ssn).getParents();
//        List<Person> auncles = new ArrayList<>();
//        List<Person> 
//        
//        for (Person parent : parents) 
//        {
//            List<Person> siblings = parent.getSiblings(ssn);
//        }
//    }
    
    public static enum Relationship
    {
        PARENT, CHILD, GRANDPARENT, GRANDCHILD, COUSIN, SIBLING, NIBLING, AUNCLE;
    }
    
    public int size()
    {
        return reg.size();
    }
}
