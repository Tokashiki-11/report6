package jp.ac.uryukyu.ie.e245744;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        String[] suits = {"♥️", "♠️", "♣️", "♦️"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards = new ArrayList<>();

        for (String suit : suits){
            for (String rank : ranks){
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}


