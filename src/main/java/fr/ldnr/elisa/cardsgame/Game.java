/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.cardsgame;

import controllers.Battle;

/**
 *
 * @author Elisa Bothy
 */
public class Game {

    public static void main(String[] args) {
        Battle battle = new Battle(3);
        System.out.println("Joueur 1 = " + (battle.getPlayers(0).getHand().size()));
        System.out.println("Joueur 2 = " + (battle.getPlayers(1).getHand().size()));
        System.out.println("Joueur 3 = " + (battle.getPlayers(2).getHand().size()));
        battle.play();
    }
}
