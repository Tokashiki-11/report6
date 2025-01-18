package jp.ac.uryukyu.ie.e245744;

import java.util.*;

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
        System.out.println(getName() + "の手札" + hand);
        String handRank = HandEvaluator.evaluateHand(hand);
        System.out.println("役: " + handRank); 
    }

    public void discardAndDraw(List<Integer> indices, Deck deck) {
        for (int index : indices) {
            hand.set(index, deck.draw());
        }
    }
}
