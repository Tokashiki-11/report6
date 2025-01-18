package jp.ac.uryukyu.ie.e245744;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Deck deck = new Deck();

       Player player1 = new Player("Taro");
       Player player2 = new Player("Jiro");

        for (int i = 0; i < 5; i++){
            player1.addCard(deck.draw());
            player2.addCard(deck.draw());
        }

        player1.showHand();
        player2.showHand();

        System.out.println("Taroさんがカードを交換するターンです。");
        System.out.println("交換したいカードの番号を , 区切りで0~4で入力してください。交換しない場合はEnterを押してください。");
        String input1 = scanner.nextLine();
        if (!input1.isEmpty()) {
            List<Integer> indices = new ArrayList<>();
            for (String s : input1.split(",")) {
                indices.add(Integer.parseInt(s));
            }
            player1.discardAndDraw(indices, deck);
        }

        System.out.println("Jiroさんがカードを交換するターンです。");
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