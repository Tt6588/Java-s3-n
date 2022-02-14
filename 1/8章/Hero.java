// 8-2 heroクラスをjavaのコードで表したもの
// 8-3 空のheroクラス

public class Hero {
  // 8-4 heroクラスに名前とHPを変数として宣言
  String name;
  int hp;

  // 8-7 眠る操作に含まれる要素を記述
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  // 8-8 メソッド「座る」「転ぶ」「逃げる」を追加
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}