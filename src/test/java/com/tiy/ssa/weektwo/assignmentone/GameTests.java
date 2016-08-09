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

public class GameTests {
    
    List<Game> games = new ArrayList<>();
    
    @Before
    public void setup() {
        this.games.add(new Game("Final Fantasy", SQUARE_ENIX, RPG));
        this.games.add(new Game("The Sims", ELECTRONIC_ARTS, SIMULATION));
        this.games.add(new Game("Mario Kart", NINTENDO, RACING));
        this.games.add(new Game("Devil May Cry", CAPCOM, ACTION));
        this.games.add(new Game("Monster Hunter", CAPCOM, ACTION));
        this.games.add(new Game("Final Fantasy XV", SQUARE_ENIX, RPG));
        this.games.add(new Game("Street Fighter", CAPCOM, FIGHTING));
        this.games.add(new Game("Star Ocean", SQUARE_ENIX, RPG));
        this.games.add(new Game("Pokemon", NINTENDO, RPG));
        this.games.add(new Game("Sim City", ELECTRONIC_ARTS, SIMULATION));
    }
    
    
    @Test
    public void gameTests() {
        grabRPGTests();
        grabAllButRPG();
        preserveOnlySquareEnix();
    }
    
    @Test
    public void gameTests2() {
        excludeElectronicArts();
    }
    
    public void grabRPGTests() {
        List<Game> gameSubset = new ArrayList<>();
        
        gameSubset = grabRPG();
        
        assertEquals(4, gameSubset.size());
        
        for (Game g : gameSubset) {
            assertTrue(g.getGenre() == RPG);
        }
    }
    
    
    public List<Game> grabRPG() {
        
        List<Game> rpgOnly = new ArrayList<>();
        
        for (Game g: this.games) {
            if (g.getGenre() == RPG) {
                rpgOnly.add(g);
            }
        }
        return rpgOnly;
    }
    
    
    public void grabAllButRPG() {
        
        List<Game> noRPG = new ArrayList<>();
        
        for (Game g: this.games) {
            if (g.getGenre() != RPG) {
                noRPG.add(g);
            }
        }
        
        assertEquals(6, noRPG.size());
        
        for (Game g : noRPG) {
            assertFalse(g.getGenre() == RPG);
        }
    }
    
    public void preserveOnlySquareEnix() {
        for (Iterator<Game> iterator = games.iterator(); iterator.hasNext();) {
            Game g = (Game) iterator.next();
            if (g.getPublisher() != SQUARE_ENIX) {
                iterator.remove();
            }
        }
        
        assertEquals(3, games.size());
        
        for (Game g : this.games) {
            assertTrue(g.getPublisher() == SQUARE_ENIX);
        }
    }
    
    public void excludeElectronicArts() {
        
        for (Iterator<Game> iterator = games.iterator(); iterator.hasNext();) {
            Game g = (Game) iterator.next();

            if (g.getPublisher() == ELECTRONIC_ARTS) {
                iterator.remove();
            }
        }
        
        assertEquals(8, games.size());
        
        for (Game g: games) {
            assertTrue(g.getPublisher() != ELECTRONIC_ARTS);
        }
    }
    
    @After
    public void clearGames() {
        this.games.clear();
    }
}
