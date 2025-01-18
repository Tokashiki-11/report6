package jp.ac.uryukyu.ie.e245744;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return hand;
    }
    
    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void showHand() {
        System.out.println(getName() + "'s hand: " + hand);
    }
}
