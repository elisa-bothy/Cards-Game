/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.CardName;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elisa Bothy
 */
public class CardPower {

    static Iterable<CardPower> values;
    public static void main(String[] args){
        Map<CardName, Integer> cardP = new HashMap<>();
       
        cardP.put(CardName.DEUX, 1);
        cardP.put(CardName.TROIS, 2);
        cardP.put(CardName.QUATRE, 3);
        cardP.put(CardName.CINQ, 4);
        cardP.put(CardName.SIX, 5);
        cardP.put(CardName.SEPT, 6);
        cardP.put(CardName.HUIT, 7);
        cardP.put(CardName.NEUF, 8);
        cardP.put(CardName.DIX, 9);
        cardP.put(CardName.VALET, 10);
        cardP.put(CardName.RENNE, 11);
        cardP.put(CardName.ROI, 12);
        cardP.put(CardName.AS, 13);
       
        for(CardName key : cardP.keySet()){
            System.out.println("key = " + key + "||value:" + cardP.get(key));
        }
        
        for(Integer i: cardP.values()){
            System.out.println("i = " + i);
        }
        
        for (Map.Entry<CardName, Integer> entry : cardP.entrySet()){
            System.out.println("entry = " + entry.getKey() +"||value:" + entry.getValue());
        }
        
    }
}
