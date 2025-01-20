package jp.ac.uryukyu.ie.e245744;

/**
 * トランプのデッキを管理するクラス
 * 52枚のカードを持つ
 * シャッフルやカードをひく機能がある
 */

import java.util.*;

public class Deck {
    /**
     * デッキ内のカードのリスト
     */
    private List<Card> cards;

    /**
     * 52枚のカードを持つデッキを作成、シャッフル
     */
    public Deck() {
        String[] suits = {"♥️", "♠️", "♣️", "♦️"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards = new ArrayList<>();

        for (String suit : suits){
            for (String rank : ranks){
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    /**
     * デッキをシャッフル
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }

    /**
     * デッキからカードを1枚ひく
     * 
     * @return 引いたカード
     */
    public Card draw() {
        return cards.remove(0);
    }

    /**
     * デッキに残っているカードの枚数を取得する
     * 
     * @return 残りのカード枚数
     */
    public int getRemainingCards() { // 残りのカード枚数を取得する
        return cards.size();
    }
}


