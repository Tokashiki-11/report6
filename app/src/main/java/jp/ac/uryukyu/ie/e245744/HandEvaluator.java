package jp.ac.uryukyu.ie.e245744;

import java.util.*;

public class HandEvaluator {
    public static String evaluateHand(List<Card> hand) {
        Map<String, Integer> rankCount = new HashMap<>();
        Set<String> suits = new HashSet<>();
        List<Integer> values = new ArrayList<>();

        Map<String, Integer> rankToValue = new HashMap<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < ranks.length; i++) {
            rankToValue.put(ranks[i], i);
        }
        
    }
}