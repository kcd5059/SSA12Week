package com.tiy.ssa.weektwo.assignmentone;
import java.util.List;
import java.util.ArrayList;

public class Lists {
    
    private Lists() {
        
    }
    
    /**
    * @return a new List<T> containing only elements that are both in #one and #other (i.e. are "equal") - 
    * but just make sure that the returned List<T> is a logical set
    */
    public static <T> List<T> match(List<T> list1, List<T> list2) {
        
        List<T> commonElements = new ArrayList<>();
        
        if (list1.size() >= list2.size()) {
                for (T list1Element : list1) {
                    if ( list2.contains(list1Element) && !commonElements.contains(list1Element)) {
                        commonElements.add(list1Element);
                    }
            }
          
        }
        else if (list1.size() < list2.size()) {
        for (T list2Element : list2) {
            if (list1.contains(list2Element) && !commonElements.contains(list2Element)) {
                commonElements.add(list2Element);
            }  
        }
            
    }
        return commonElements;

}

    /**
    * @return a new List, ordered by the length of the input strings in descending order
    */
    /*public static List<String> descendingBySize(List<String> input) {
        
        boolean swap = true;
        String[] strArray = new String[input.size()];
        List<String> postSort = new ArrayList<>();
        
        for (String l : input) {
            int i = 0;
            strArray[i] = l;
            i++;
        }
        
        while (swap) {
            int j = 0;
            swap = false;
            String temp = "";
            for (j =  0;  j < strArray.length - 1;  j++) {
               
                if ( strArray[j].length() < strArray[j + 1].length() ) {
                    temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                    swap = true;
                } 
            } 
       } 
        
        for (int i = 0; i < strArray.length - 1; i++) {
            postSort.add(strArray[i]);
        }
        
        return postSort;
    }*/
}
