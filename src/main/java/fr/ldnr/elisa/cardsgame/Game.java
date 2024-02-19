/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.cardsgame;

import entities.Card;
import entities.Deck;

/**
 *
 * @author Elisa Bothy
 */
public class Game {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        for (Card card : deck.deal(5)){
            System.out.println(card);
        }
        for (Card card : deck.deal(5)){
            System.out.println(card);
        }
        deck.showDealt();
        System.out.println("La taille du jeu restant :"
                + deck.size());
    }
}
