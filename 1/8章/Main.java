public class Main {
  // 8-1 mainメソッドを作る
  public static void main(String[] args) {
    // // 8-9.10.11　勇者を作成
    // Hero h = new Hero();
    // // 8-12 勇者インスタンスを生成して初期値を代入
    // h.name = "ミナト";
    // h.hp = 100;
    // System.out.println("勇者" + h.name + "を生み出しました！");
    // // 8-13 仮想世界に勇者を生み出すプログラム
    // h.sit(5);
    // h.slip();
    // h.sit(25);
    // h.run();

    // 8-14 オブジェクト指向ではない方法で作成したプログラム
    // int yusha_hp = 100;
    // int matango1_hp = 50;
    // int matango2_hp = 48;
    // String yusha_name = "ミナト";
    // int matango1_level = 10;
    // int matango2_level = 10;
    // System.out.println(yusha_name + "は5秒座った！");
    // yusha_hp += 5;
    // System.out.println("HPが5ポイント回復した");
    // /* ： */
    // /* ： */

    // 8-16 仮想世界に勇者とお化けキノコ2匹を生成する
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}
