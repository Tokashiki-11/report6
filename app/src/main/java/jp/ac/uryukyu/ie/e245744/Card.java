package jp.ac.uryukyu.ie.e245744;

public class Card {
    private String suit; //トランプのマーク
    private String rank; //トランプの数字

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + rank; //例:ハートの2は "♥️2"
    }
}
