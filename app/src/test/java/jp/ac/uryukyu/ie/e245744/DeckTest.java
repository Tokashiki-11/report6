package jp.ac.uryukyu.ie.e245744;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DeckTest {
    @Test
    void testDeckSize() {
        Deck deck = new Deck();
        assertEquals(52, deck.getRemainingCards()); // 初期状態では52枚
    }

    @Test
    void testDrawCard() {
        Deck deck = new Deck();
        deck.draw(); // 1枚引く
        assertEquals(51, deck.getRemainingCards()); // 51枚になる
    }

    @Test
    void testDeckIsEmpty() {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.draw();
        }
        assertThrows(IndexOutOfBoundsException.class, () -> deck.draw()); // 53枚目を引くとエラー
    }
}
