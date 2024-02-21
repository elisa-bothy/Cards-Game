/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Elisa Bothy
 */
public class BattleTest {
    
    public BattleTest() {
        Battle battle = new Battle(1);
        Battle battle2 = new Battle(3);
        
        assertEquals(battle.getNb(), 2);
        assertEquals(battle2.getNb(), 3);  
        assertFalse(battle2.getDeck().isEmpty());
        assertEquals(battle2.getPlayers(0).getHand().size(), 17);
    }
    

    /**
     * Test of toString method, of class Battle.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of getDeck method, of class Battle.
     */
    @Test
    public void testGetDeck() {
    }

    /**
     * Test of setDeck method, of class Battle.
     */
    @Test
    public void testSetDeck() {
    }

    /**
     * Test of getPlayers method, of class Battle.
     */
    @Test
    public void testGetPlayers() {
    }

    /**
     * Test of setPlayers method, of class Battle.
     */
    @Test
    public void testSetPlayers() {
    }

    /**
     * Test of getNb method, of class Battle.
     */
    @Test
    public void testGetNb() {
    }

    /**
     * Test of setNb method, of class Battle.
     */
    @Test
    public void testSetNb() {
    }

    /**
     * Test of play method, of class Battle.
     */
    @Test
    public void testPlay() {
    }

    /**
     * Test of win method, of class Battle.
     */
    @Test
    public void testWin() {
    }
    
}
