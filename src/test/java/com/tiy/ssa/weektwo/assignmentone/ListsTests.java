package com.tiy.ssa.weektwo.assignmentone;

import static org.junit.Assert.*;
import static com.tiy.ssa.weektwo.assignmentone.Game.Genre.*;
import static com.tiy.ssa.weektwo.assignmentone.Game.Publisher.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListsTests {
    
    List<Game> list1 = new ArrayList<>();
    List<Game> list2 = new ArrayList<>();
    List<String> list3 = new ArrayList<>();

    @Before
    public void setup() {
        
        list1.add(new Game("Final Fantasy", SQUARE_ENIX, RPG));
        list1.add(new Game("Monster Hunter", CAPCOM, ACTION));
        list1.add(new Game("Star Ocean", SQUARE_ENIX, RPG));
        list1.add(new Game("Pikmin", NINTENDO, ADVENTURE));
        list1.add(new Game("The World Ends With You", SQUARE_ENIX, ACTION));
        
        list2.add(new Game("Street Fighter", CAPCOM, FIGHTING));
        list2.add(new Game("Final Fantasy", SQUARE_ENIX, RPG));
        list2.add(new Game("Monster Hunter", CAPCOM, ACTION));
        list2.add(new Game("The Sims", ELECTRONIC_ARTS, SIMULATION));
        
        list3.add("1234");
        list3.add("12345678");
        list3.add("1");
        list3.add("1234567890");
        list3.add("12345");
    }
    
    @Test
    public void listsTests() {
        List<Game> commonGames = Lists.match(list1, list2);
        assertEquals(2, commonGames.size());
        Game ff = new Game("Final Fantasy", SQUARE_ENIX, RPG);
        Game mh = new Game("Monster Hunter", CAPCOM, ACTION);
        Game sf = new Game("Street Fighter", CAPCOM, FIGHTING);
        
        assertTrue(commonGames.contains(ff));
        assertTrue(commonGames.contains(mh));
        assertFalse(commonGames.contains(sf));
        
        //List<String> orderedBySize = new ArrayList<>(Lists.descendingBySize(list3));
        
        //assertTrue(orderedBySize.get(0) == "1234567890");
    }
    
    @After
    public void clearLists() {
        list1.clear();
        list2.clear();
    }

}
