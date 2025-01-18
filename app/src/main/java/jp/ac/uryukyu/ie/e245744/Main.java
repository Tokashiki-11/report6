package jp.ac.uryukyu.ie.e245744;

public class Main {
    public static void main(String[] args) {
       Deck deck = new Deck();
       Player player1 = new Player("Taro");
       Player player2 = new Player("Jiro");

        for (int i = 0; i < 5; i++){
            player1.addCard(deck.draw());
            player2.addCard(deck.draw());
        }

       player1.showHand();
       player2.showHand();
    }
}