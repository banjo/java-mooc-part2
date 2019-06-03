
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for (Card card : cards){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand o) {
        int thisValue = 0;
        int oValue = 0;
        
        for (Card card : cards){
            thisValue += card.getValue();
        }
        
        for (Card card : o.cards){
            oValue += card.getValue();
        }
        
        return thisValue - oValue;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
}
