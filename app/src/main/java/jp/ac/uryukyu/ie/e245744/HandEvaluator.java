package jp.ac.uryukyu.ie.e245744;

/**
 * 手札から役を判定するクラス
 */

import java.util.*;

public class HandEvaluator {
    /**
     * 指定された手札の役を判定する
     * 
     * @param hand 判定する手札
     * @return 判定された役
     */
    public static String evaluateHand(List<Card> hand) {
        ///各ランクや各柄の出現回数を保持する
        Map<String, Integer> rankCount = new HashMap<>();
        //手札の柄の種類を保持する
        Set<String> suits = new HashSet<>();
        //手札のカードの数値を格納するリスト
        List<Integer> values = new ArrayList<>();

        // ランクを数値に変換する
        Map<String, Integer> rankToValue = new HashMap<>();
         String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
         for (int i = 0; i < ranks.length; i++) {
            rankToValue.put(ranks[i], i);
        }

        // 各ランクの出現回数をカウント
        for (Card card : hand) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
            suits.add(card.getSuit());
            values.add(rankToValue.get(card.getRank()));
        }

        // 数値化したランクをソートする
        Collections.sort(values);
        // ストレート(最小と最大の差が4かつ重複なし)の判定
        boolean isStraight = values.get(4) - values.get(0) == 4 && new HashSet<>(values).size() == 5;
        // フラッシュ(柄が全て同じ)の判定
        boolean isFlush = suits.size() == 1;

        // 各役の条件に基づき役判定
        if (isFlush && isStraight && values.contains(rankToValue.get("A"))) return "Royal Flush";
        if (isFlush && isStraight) return "Straight Flush";
        if (rankCount.containsValue(4)) return "Four of a kind";
        if (rankCount.containsValue(3) && rankCount.containsValue(2)) return "Full House";
        if (isFlush) return "Flush";
        if (isStraight) return "Straight";
        if (rankCount.containsValue(3)) return "Three of a Kind";
        if (Collections.frequency(rankCount.values(), 2) == 2) return "Two pair";
        if (rankCount.containsValue(2)) return "One Pair";

        // どの役にも該当しない場合
        return "High Card";
    }

}