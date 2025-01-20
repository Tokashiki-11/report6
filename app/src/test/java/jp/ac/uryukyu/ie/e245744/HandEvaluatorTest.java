package jp.ac.uryukyu.ie.e245744;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class HandEvaluatorTest {
    @Test
    void testRoyalFlush() {
        List<Card> hand = Arrays.asList(
            new Card("♥️", "10"), new Card("♥️", "J"), 
            new Card("♥️", "Q"), new Card("♥️", "K"), 
            new Card("♥️", "A")
        );
        assertEquals("Royal Flush", HandEvaluator.evaluateHand(hand));
    }

    @Test
    void testStraightFlush() {
        List<Card> hand = Arrays.asList(
            new Card("♠️", "5"), new Card("♠️", "6"), 
            new Card("♠️", "7"), new Card("♠️", "8"), 
            new Card("♠️", "9")
        );
        assertEquals("Straight Flush", HandEvaluator.evaluateHand(hand));
    }

    @Test
    void testFourOfAKind() {
        List<Card> hand = Arrays.asList(
            new Card("♠️", "A"), new Card("♦️", "A"),
            new Card("♣️", "A"), new Card("♥️", "A"),
            new Card("♠️", "3")
        );
        assertEquals("Four of a kind", HandEvaluator.evaluateHand(hand));
    }

    @Test
    void testOnePair() {
        List<Card> hand = Arrays.asList(
            new Card("♠️", "2"), new Card("♦️", "2"),
            new Card("♠️", "4"), new Card("♣️", "7"),
            new Card("♣️", "9")
        );
        assertEquals("One Pair", HandEvaluator.evaluateHand(hand));
    }
}
