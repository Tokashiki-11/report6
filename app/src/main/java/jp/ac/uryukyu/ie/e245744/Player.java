package jp.ac.uryukyu.ie.e245744;

import java.util.*;


/**
 * ポーカーのプレイヤーを表す
 * 手札のカードの追加・交換・表示をする
 */
public class Player {
    private String name; //プレイヤーの名前
    private List<Card> hand; //プレイヤーの手札

    /**
     * プレイヤーを作成
     * 
     * @param name プレイヤーの名前
     */
    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    /**
     * プレイヤーの手札を取得
     * 
     * @return プレイヤーの手札(カードのリスト)
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * プレイヤーの名前を取得
     * 
     * @return プレイヤーの名前
     */
    public String getName() {
        return name;
    }

    /**
     * 手札にカードを追加
     * 
     * @param card 追加するカード
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * プレイヤーの手札を表示し、役を判定して出力
     */
    public void showHand() {
        System.out.println(getName() + "の手札" + hand);
        String handRank = HandEvaluator.evaluateHand(hand);
        System.out.println("役: " + handRank); 
    }

    /**
     * 指定された位置のカードを捨て、新しいカードに交換
     * 
     * @param indices 捨てるカードの位置
     * @param deck 新しいカードを引くためのデッキ
     */
    public void discardAndDraw(List<Integer> indices, Deck deck) {
        for (int index : indices) {
            if (index >= 0 && index < hand.size()) { 
                hand.set(index, deck.draw());
            }
        }
        System.out.println(getName() + "は、カードを交換した。");
        showHand();
    }
}
