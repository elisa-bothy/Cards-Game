/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.CardName;
import enums.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Elisa Bothy
 */
public class Deck extends ArrayList<Card> {
    
    //les cartes distribuées
    private ArrayList<Card> dealt;
    
    public Deck() {
        dealt = new ArrayList<>();
        for (Color couleur : Color.values()) {
            for (CardName name : CardName.values()) {
                this.add(new Card(couleur, name));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck{");
        sb.append('}');
        return sb.toString();
    }
    
    public Collection<Card> deal (int n){
       
      ArrayList<Card> returned = new ArrayList<>();
      for (int i=0; i < n ; i++){
          Card card = this.remove(0);
          returned.add(card);
          dealt.add(card);
      }  
      return returned;
    } 
    
    //mélange les cartes du jeu
    public void shuffle() {
        Collections.shuffle(this);
    }
    
    //trie les cartes du jeu
    public void sort(){
       this.sort((Card o1, Card o2) -> o1.compareTo(o2));
    }
    
    // remet les cartes distribuées dans le jeu
    public void merge(){
        this.addAll(dealt);
        dealt.clear();
    }
    
    //remet le jeu dans l'état initial, trié
    public void mergeAndSort(){
        merge();
        sort();
    }
    
    public void showDealt(){
        for(Card card : dealt){
            System.out.println(card);
        }
    }
}
