/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Elisa Bothy
 */
public class DeckTest {
    
    public DeckTest() {
        
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDeal() {
        Deck deck = new Deck();
        deck.deal(56);
        
        assertTrue(deck.isEmpty());  
        assertEquals(deck.size(), 0);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
    }

    /**
     * Test of sort method, of class Deck.
     */
    @Test
    public void testSort() {
    }

    /**
     * Test of merge method, of class Deck.
     */
    @Test
    public void testMerge() {
    }

    /**
     * Test of mergeAndSort method, of class Deck.
     */
    @Test
    public void testMergeAndSort() {
    }

    /**
     * Test of showDealt method, of class Deck.
     */
    @Test
    public void testShowDealt() {
    }
    
}
