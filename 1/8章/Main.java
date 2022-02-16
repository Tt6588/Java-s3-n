public class Main {
  // 8-1 mainメソッドを作る
  public static void main(String[] args) {
    // 8-9.10.11　勇者を作成
    Hero h = new Hero();
    // 8-12 勇者インスタンスを生成して初期値を代入
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    // 8-12 仮想世界に勇者を生み出すプログラム
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}
