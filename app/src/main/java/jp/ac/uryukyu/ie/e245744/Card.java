package jp.ac.uryukyu.ie.e245744;

/**
 * トランプの1枚のカードを表すクラス
 * 各カードはsuit(絵柄)とrank(数字)を持つ
 */
public class Card {
    private String suit; //トランプのマーク
    private String rank; //トランプの数字

    /**
     * suitとrankで1枚のカードを作成する
     * 
     * @param suit トランプの絵柄(♠️, ♣️, ♥️, ♦️)
     * @param rank トランプの数字(2~A)
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * カードの絵柄を取得する
     * 
     * @return カードの絵柄
     */
    public String getSuit() {
        return suit;
    }

    /**
     * カードの数字を取得する
     * 
     * @return カードの数字
     */
    public String getRank() {
        return rank;
    }

    /**
     * カードの情報を文字列で返す
     * 例:ハートの2は "♥️2"
     * 
     * @return カードの文字列表現
     */
    @Override
    public String toString() {
        return suit + rank; 
    }
}
