/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entities;

import enums.CardName;
import enums.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Elisa Bothy
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of equals method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        Card c1 = new Card(Color.COEUR, CardName.NEUF);
        Card c2 = new Card(Color.COEUR, CardName.NEUF);
        Card c3 = new Card(Color.PIQUE, CardName.NEUF);
        Card c4 = new Card(Color.COEUR, CardName.AS);
        
        assertTrue(c1.equals(c2), "comparaison de cartes équivalentes");
        assertFalse(c1.equals(c3), "comparaison de cartes de nom de cartes différentes " );
        assertFalse(c1.equals(c4), "comparaison de cartes de couleurs différentes");
        assertFalse(c3.equals(c4), "comparaison de cartes différentes");
    }
    
    /**
     * Test of compareTo method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testCompareTo() {
        Card c1 = new Card(Color.COEUR, CardName.NEUF);
        Card c2 = new Card(Color.COEUR, CardName.NEUF);
        Card c3 = new Card(Color.PIQUE, CardName.NEUF);
        Card c4 = new Card(Color.COEUR, CardName.AS);
        
        assertTrue(c1.compareTo(c2)==0, "ordre de cartes équivalentes");
        assertTrue(c1.compareTo(c3)<0, "ordre de cartes de nom de cartes différentes " );
        assertTrue(c1.compareTo(c4)<0, "ordre de cartes de couleurs différentes");
        assertTrue(c3.compareTo(c4)<0, "ordre de cartes différentes");
    }

    
}
