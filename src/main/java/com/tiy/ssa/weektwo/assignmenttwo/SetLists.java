package com.tiy.ssa.weektwo.assignmenttwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetLists {
    
    /**
     * @return a new List<T> containing only elements that are both in #one and #other (i.e. are "equal") - 
     * but just make sure that the returned List<T> is a logical set
     */
     public static <T> List<T> match(List<T> list1, List<T> list2) {
         
         Set<T> commonElementSet = new HashSet<>();
         
         
         if (list1.size() >= list2.size()) {
             for (T list1Element : list1) {
                 if ( list2.contains(list1Element)) {
                     commonElementSet.add(list1Element);
                 }
         }
       
         }
         else if (list1.size() < list2.size()) {
             for (T list2Element : list2) {
                 if (list1.contains(list2Element)) {
                     commonElementSet.add(list2Element);
                 }  
             }
         
         }
         return new ArrayList<T>(commonElementSet);
     }

}
