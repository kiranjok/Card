/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;

import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * modifier :Kiranjot Kiranjot
 * Student ID :991705854
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7]; 
       Random random = new Random
        for (int i=0; i<magicHand.length; i++)
        {
            Card Number = new Card();
            Number.setValue(random.nextInt(13)+1);
            Number.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=Number;
             System.out.println(Number.getSuit()+"\t"+Number.getValue());
        }
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Spades");

        boolean found = false;
        for(Card card : magicHand){
            if(card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Congratulation! The lucky card is in the magic hand");
        } else{
            System.out.println("Sorry, The lucky card is not in the magic hand");
        }
         
    }
    
}
