package jp.ac.uryukyu.ie.e245744;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class PlayerTest {
    @Test
    void testAddCard() {
        Player player = new Player("Taro");
        Card card = new Card("♠️", "A");
        player.addCard(card);
        assertEquals(1, player.getHand().size());
        assertEquals("♠️A", player.getHand().get(0).toString());
    }

    @Test
    void testDiscardAndDraw() {
        Player player = new Player("Taro");
        Deck deck = new Deck();

        player.addCard(new Card("♠️", "2"));
        player.addCard(new Card("♠️", "3"));
        player.addCard(new Card("♠️", "4"));
        player.addCard(new Card("♠️", "5"));
        player.addCard(new Card("♠️", "6"));

        List<Integer> indices = Arrays.asList(0, 1);
        player.discardAndDraw(indices, deck);

        assertEquals(5, player.getHand().size()); // 手札の枚数は変わらない
    }
}