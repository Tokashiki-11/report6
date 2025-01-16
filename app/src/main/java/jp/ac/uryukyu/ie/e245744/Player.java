package jp.ac.uryukyu.ie.e245744;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void showHand() {
        System.out.println("Hand: " + hand);
    }
}
