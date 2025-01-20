package jp.ac.uryukyu.ie.e245744;

import java.util.*;

/**
 * ゲーム進行を管理するメインクラス
 * 2人のプレイヤーにカードを配り、任意のカードを交換する
 */
public class Main {
    /**
     * メインメソッド。ゲームの進行を制御
     * 
     * @param args 使用しない
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Deck deck = new Deck();

       // プレイヤーの作成
       System.out.println("プレイヤー1の名前を入力してください");
        String name1 = scanner.nextLine();
       Player player1 = new Player(name1);

       System.out.println("プレイヤー2の名前を入力してください");
       String name2 = scanner.nextLine();
       Player player2 = new Player(name2);

       // 各プレイヤーに5枚のカードを配る
        for (int i = 0; i < 5; i++){
            player1.addCard(deck.draw());
            player2.addCard(deck.draw());
        }

        // 手札を表示
        player1.showHand();
        player2.showHand();

        // player1のターン(カード交換)
        System.out.println (name1 + "さんがカードを交換するターンです。");
        System.out.println("交換したいカードの番号を , 区切りで0~4で入力してください。交換しない場合はEnterを押してください。");
        String input1 = scanner.nextLine();
        if (!input1.isEmpty()) {
            List<Integer> indices = new ArrayList<>();
            for (String s : input1.split(",")) {
                indices.add(Integer.parseInt(s));
            }
            player1.discardAndDraw(indices, deck);
        }

        // player2のターン(カード交換)
        System.out.println(name2 + "さんがカードを交換するターンです。");
        System.out.println("交換したいカードの番号を , 区切りで0~4で入力してください。交換しない場合はEnterを押してください。");
        String input2 = scanner.nextLine();
        if (!input2.isEmpty()) {
            List<Integer> indices = new ArrayList<>();
            for (String s : input2.split(",")) {
                indices.add(Integer.parseInt(s));
            }
            player2.discardAndDraw(indices, deck);
        }
        scanner.close();
    }
}