/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Player;

/**
 *
 * @author Elisa Bothy
 */
public abstract class Games{
    protected Player[]players;
    protected int nb;
    
    public Games(int nb){
        this.nb = nb;
        players = new Player[nb];
    }
    public abstract void play();
    
    public abstract Player win();    
}
