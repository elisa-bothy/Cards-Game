/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Card;
import entities.Deck;
import entities.Player;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elisa Bothy
 */
public class Battle extends Games {

    private Deck deck;

    //création d'un jeu avec deux joueurs
    public Battle(int n) {
        super((n < 2) ? 2 : n);
        n = ((n<2)?2:n);
        deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < n; i++) {
            players[i] = new Player("Harry");
            players[i].getHand().addAll(deck.deal((int)52 / n));
        }
        
    }

    public Battle(Deck deck, int nb) {
        super(nb);
        this.deck = deck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Battle{");
        sb.append("deck=").append(deck);
        sb.append('}');
        return sb.toString();
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player getPlayers(int i) {
        return players[i];
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    @Override
    public void play() {
        // Créez un tableau de cartes de la même taille que le nombre de joueurs
        Card[] cards = new Card[getNb()];
        int maxIndex = 0;
        // Copiez la première carte de chaque main de joueur dans le tableau cards
        for (int j = 0; j < getNb(); j++) {
            cards[j] = players[j].getHand().get(0);
            players[j].getHand().remove(0);
        }

        // Trouvez l'index du joueur ayant la carte la plus grande
        
        for (int i = 1; i < getNb(); i++) {
            if (cards[i].compareTo(cards[maxIndex]) > 0) {
                maxIndex = i;
            }
        }

        // Ajoutez toutes les cartes au joueur ayant la carte la plus grande
        for (int j = 0; j < getNb(); j++) {
            if (j != maxIndex) {
                players[maxIndex].getHand().add(cards[j]);
            }
        }

        try ( FileOutputStream fos = new FileOutputStream("BATTAILLEEEEEE.txt");  
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for(int k=0; k<getNb(); k++){
                oos.writeObject("Joueur " + k + " : ");
                oos.writeObject(players[k]);
            }
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }
        //lire le fichier
        try(FileInputStream fis = new FileInputStream("BATTAILLEEEEEE.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)){
            while(true) { //sale mais ça fonctionne 
                Object o = ois.readObject();
                System.out.println(o.getClass());
            //afficher les personnes lues
                switch (o) {
                    case String s -> System.out.println("s = " + s);
                    case Player p -> System.out.println("p = " + p);
                    case default -> {}
                }
            }
        } catch (EOFException ex){
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public Player win() {
        for(int i=0;i<2;i++){
            if (!players[i].getHand().isEmpty()) {
                return players[i];
            } else {
                return null;
            }
        }
        return null;
    }
}
