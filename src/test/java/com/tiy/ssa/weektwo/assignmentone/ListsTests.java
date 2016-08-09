package com.tiy.ssa.weektwo.assignmentone;

import static org.junit.Assert.*;
import static com.tiy.ssa.weektwo.assignmentone.Game.Genre.*;
import static com.tiy.ssa.weektwo.assignmentone.Game.Publisher.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class ListsTests {
    
    List<Game> list1 = new ArrayList<>();
    List<Game> list2 = new ArrayList<>();

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
    }

}
