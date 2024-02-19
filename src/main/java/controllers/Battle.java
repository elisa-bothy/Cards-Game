/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Deck;
import entities.Player;

/**
 *
 * @author Elisa Bothy
 */
public class Battle extends Games {
    
    private Deck deck;
    //création d'un jeu avec deux joueurs
    public Battle() {
        super(2);
        deck = new Deck();
        deck.shuffle();
        players[0] = new Player ("Harry");
        players[1] = new Player ("Hermione");
        players[0].getHand().addAll(deck.deal(26));
        players[1].getHand().addAll(deck.deal(26));
    }

    @Override
    public void play() {
        for(int i=0; i<10; i++) {
            if (players[0].getHand().get(0).compareTo(players[1].getHand().get(0)) > 0) {
                players[0].getHand().add(players[0].getHand().size(), players[1].getHand().get(0));
                players[1].getHand().remove(0);
                players[0].setScore(players[0].getScore()+1);
                System.out.println(players[1].getHand().get(0));
                System.out.println(players[0].getHand().get(0));
                System.out.println("Le joueur 0 a gagné la main" + players[0].getHand().size());
            }
            if (players[1].getHand().get(0).compareTo(players[0].getHand().get(0)) > 0) {
                players[1].getHand().add(players[1].getHand().size(), players[0].getHand().get(0));
                players[0].getHand().remove(0);
                players[1].setScore(players[1].getScore()+1);
                System.out.println(players[1].getHand().get(0));
                System.out.println(players[0].getHand().get(0));
                System.out.println("Le joueur 1 a gagné la main"+ players[1].getHand().size());
            }
        }
    }

    @Override
    public Player win() {
        if (players[0].getHand().isEmpty()) {
            return players[1];
        } else if (players[1].getHand().isEmpty()) {
            return players[0];
        } else {
            return null;
        }

    }

}
