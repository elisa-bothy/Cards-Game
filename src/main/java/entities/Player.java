/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.Sexe;
import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author Elisa Bothy
 */
public class Player {
    private String name;
    private String forName;
    private Sexe sexe;
    private int score;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.forName = "Elisa";
        this.sexe = Sexe.FEMALE;
        this.score = 0;
        this.hand = new Hand();
    }

    public Player(String name, String forName, Sexe sexe, int score, Hand hand) {
        this.name = name;
        this.forName = forName;
        this.sexe = sexe;
        this.score = score;
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{");
        sb.append("name=").append(name);
        sb.append(", forName=").append(forName);
        sb.append(", sexe=").append(sexe);
        sb.append(", score=").append(score);
        sb.append(", hand=").append(hand);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.forName);
        hash = 59 * hash + Objects.hashCode(this.sexe);
        hash = 59 * hash + this.score;
        hash = 59 * hash + Objects.hashCode(this.hand);
        return hash;
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
        final Player other = (Player) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.forName, other.forName)) {
            return false;
        }
        if (this.sexe != other.sexe) {
            return false;
        }
        return Objects.equals(this.hand, other.hand);
    }
   
    
}
