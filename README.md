# ドローポーカー

## 概要
このプロジェクトは、Javaで実装した2人でプレイできるドローポーカーのゲームです。
プレイヤーには5枚のカードが配られ、手札から不要なカードを山札にある別のカードと交換し、強い役を作ることを目指すゲームです。
役判定は一般的なポーカーのルールに基づいており、手札の強さから勝敗を決定します。

## ルール
1. プレイヤーに5枚のカードが配られます。
2. 不要なカードの位置を0~4で入力し、別のカードと交換します。交換したくない場合はEnterを押します。
3. 最終的な手札を比較し、強い役を持つプレイヤーの勝利となります。役が同じ場合、役を構成するカードの数字の強さを比較します。
   役の強さは以下の通りです。(強い順)
   ロイヤルフラッシュ、ストレートフラッシュ、フォーカード、フルハウス、フラッシュ、ストレート、スリーカード、ツーペア、ワンペア、ハイカード

## 開発環境
言語：Java
IDE：VSCode
テスト：JUnit5
