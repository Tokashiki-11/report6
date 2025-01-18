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

        //手札の情報を集計
        for (Card card : hand) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
            suits.add(card.getSuit());
            values.add(rankToValue.get(card.getRank()));
        }

        // ソートしてストレート判定
        Collections.sort(values);
        boolean isStraight = values.get(4) - values.get(0) == 4 && new HashSet<>(values).size() == 5;
        boolean isFlush = suits.size() == 1;

        // ロイヤル・フラッシュ
        if (isFlush && isStraight && values.contains(rankToValue.get("A"))) return "Royal Flush";
        // ストレート・フラッシュ
        if (isFlush && isStraight) return "Straight Flush";
        // フォーカード
        if (rankCount.containsValue(4)) return "Four of a kind";
        // フルハウス
        if (rankCount.containsValue(3) && rankCount.containsValue(2)) return "Full House";
        // フラッシュ
        if (isFlush) return "Flush";
        // ストレート
        if (isStraight) return "Straight";
        // スリーカード
        if (rankCount.containsValue(3)) return "Three of a Kind";
        // ツーペア
        if (Collections.frequency(rankCount.values(), 2) == 2) return "Two pair";
        // ワンペア
        if (rankCount.containsValue(2)) return "One Pair";

        return "High Card";
    }

}