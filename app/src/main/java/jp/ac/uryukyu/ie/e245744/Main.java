package jp.ac.uryukyu.ie.e245744;

public class Main {
    public static void main(String[] args) {
       Deck deck = new Deck();
       Player player = new Player();

        for (int i = 0; i < 5; i++){
            player.addCard(deck.draw());
        }

       player.showHand();
    }
}
