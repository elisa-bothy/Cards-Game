/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.CardName;
import enums.Couleur;
import java.util.Objects;


/**
 *
 * @author Elisa Bothy
 */
public class Card {
    private Couleur couleur;
    private CardName name;

    public Card() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.couleur);
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("couleur=").append(couleur);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public Card(Couleur couleur, CardName name) {
        this.couleur = couleur;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.couleur != other.couleur) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public CardName getName() {
        return name;
    }

    public void setName(CardName name) {
        this.name = name;
    }
    
}
