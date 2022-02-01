public class Demo3 {
  public static void main(String[] args) {
    
    // 3-1 天気による行動の変化をjavaで表す
    boolean tenki31 = true;
    // boolean tenki31 = false;
    if (tenki31 == true){
      System.out.println("洗濯します");
      System.out.println("散歩に行きます");
    } else{
      System.out.println("DVDを見ます");
    }
    
    // 3-2 トイレの空きを待つ繰り返し処理
    boolean doorClose32 = true;
    // boolean doorClose32 = false;
    while (doorClose32 == true){
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }

    // 3-3 波カッコを省略した記述 **省略は非推奨**
    boolean tenki33 = true;
    // boolean tenki33 = false;
    if (tenki33 == true){
      System.out.println("洗濯します");
      System.out.println("散歩に行きます");
    } else //block内が1行なら波カッコ省略可能
      System.out.println("DVDを見ます");
    
    // 3-4 冗長でスッキリしないソースコード
    System.out.println("あなたの運勢を占います");
    int fortune34 = new java.util.Random().nextInt(4)+1;
    if (fortune34 == 1){
      System.out.println("大吉");
      if (fortune34 == 2){
        System.out.println("中吉");
      }
      if (fortune34 == 3){
        System.out.println("吉");
      }
      if (fortune34 == 4){
        System.out.println("凶");
      }
      
    // 3-5 breakを書き忘れたコード
    System.out.println("あなたの運勢を占います");
    int fortune35 = 1;
    switch (fortune35){
      case 1:
        System.out.println("大吉");
        // break;   //sase2の内容まで表示されてしまう
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      default:
        System.out.println("凶");
    }
    
    // 3-6 breakをあえて書かない
    System.out.println("あなたの運勢を占います");
    int fortune36 = new java.util.Random().nextInt(5)+1;
    switch (fortune36){
      case 1:
        System.out.println("いいね");
        break;
      case 2:
      case 3:
        System.out.println("ふつう");
        break;
      case 4:
        System.out.println("びみょう");
        break;
      case 5:
        System.out.println("だめだこりゃ……");
    }

    // 3-7 基本的なfor文
    for (int i37 = 0; i37 < 10; i37++){
      System.out.println("こんにちは");
    }
    
    // 3-8 ループ変数を表示する
    for (int i38 = 1; i38 < 5; i38++){
      System.out.print("現在" + i38 + "週目→");
    }

    // 3-9 for文のネスト
    for (int i39 = 1; i39 < 10; i39++){
      for (int j39 = 1; j39 < 10; j39++){
        System.out.print(i39 * j39);
        System.out.print(" ");
      }
      System.out.println("");  //改行の出力
    }

    // 練習問題3－1
    // 1 (weight == 60){
    // 2 ((age1+age2)*2 > 60){
    // 3 (age & 2 == 1){
    // 4 (name.equals("湊")){

    // 練習問題3－3
    int isHungry = 0;
    // int isHungry = 1;
    String food = "リンゴ";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹いっぱいです");
    } else{
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
      System.out.println("ご馳走様でした");
    }

    // 練習問題3-4
    boolean tenki34 = true;
    // boolean tenki34 = false;
    if (tenki34 == true){
      System.out.println("洗濯します");
      System.out.println("散歩に行きます");
    } else{  //内容が1行でないのに波カッコが表記されていなかった
      System.out.println("DVDを見ます");
      System.out.println("寝ます");
    }
    
    // 練習問題3-5
    System.out.print("[[メニュー]1:検索　2:登録　3:削除　4:変更>]");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }
    
    // 練習問題3-6
    System.out.println("【数当てゲーム】");
    int ans3 = new java.util.Random().nextInt(9);
    for (int i3 = 0; i3 < 5; i3++){
      System.out.println("0～9の数字の入力してください");
      int num3 = new java.util.Scanner(System.in).nextInt();
      if (ans3 == num3){
        System.out.println("あたり！");
      }else {
        System.out.println("はずれ……");
      }
    }
    System.out.println("ゲームを終了します");
  }
}