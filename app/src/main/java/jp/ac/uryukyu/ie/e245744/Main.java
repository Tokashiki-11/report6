package jp.ac.uryukyu.ie.e245744;

public class Main {
    public static void main(String[] args) {
       Player player1 = new Player("Taro");

       Deck deck = new Deck();

        for (int i = 0; i < 5; i++){
            player1.addCard(deck.draw());
        }

        player1.showHand();
    }
}