package com.tiy.ssa.weektwo.assignmentone;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    
    /**
    * @return a new List<T> containing only elements that are both in #one and #other (i.e. are "equal") - 
    * but just make sure that the returned List<T> is a logical set
    */
    public static <Game> List<Game> match(List<Game> list1, List<Game> list2) {
        
        List<Game> commonGames = new ArrayList<>();
        
        if (list1.size() >= list2.size()) {
                for (Game list1Game : list1) {
                    if ( list2.contains(list1Game) ) {
                        commonGames.add(list1Game);
                    }
            }
          
        }
        else if (list1.size() < list2.size()) {
        for (Game list2Game : list2) {
            if (list1.contains(list2Game)) {
                commonGames.add(list2Game);
            }  
        }
            
    }
        return commonGames;

}

    /**
    * @return a new List, ordered by the length of the input strings in descending order
    */
    /*
    public static List<String> descendingBySize(List<String> input) {


    } */
}
