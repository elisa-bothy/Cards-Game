/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.CardName;
import enums.Color;
import java.util.Objects;

/**
 *
 * @author Elisa Bothy
 */
public class Card implements Comparable<Card> {

    private Color color;
    private CardName name;

    public Card() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.color);
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("couleur=").append(color);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public Card(Color couleur, CardName name) {
        this.color = couleur;
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
        if (this.color != other.color) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    public Color getCouleur() {
        return color;
    }

    public void setCouleur(Color couleur) {
        this.color = couleur;
    }

    public CardName getName() {
        return name;
    }

    public void setName(CardName name) {
        this.name = name;
    }

    // compare par nom de la carte puis par couleur sachant que 
    // pique>coeur>carreau>trèfle
    @Override
    public int compareTo(Card o) {
        if (this.name != o.name) {
            return this.name.ordinal() - o.name.ordinal();
        }
        return this.color.ordinal() - o.color.ordinal();
    }

}
