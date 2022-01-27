public class Demo3 {
  public static void main(String[] args) {
    // 2-4 インクリメント演算子
    int a;
    a = 100;
    a++;
    System.out.println(a);

    // コード2-5　代入時の自動型変換　値より大きな方の変数に代入
    float f = 3;
    double d = f;
    System.out.println(f);
    System.out.println(d);
    
    // コード2-6　代入時の自動型変換　値より小さな方の変数に代入（エラー）
    // int i = 3.2;
    // System.out.pritnln(i);

    
    // コード2-7　キャスト演算子（強制的な型変換）
    int age = (int)3.2;
    // この場合強制的に型変換を行うため小数点以下が切り捨てられる情報の欠損が起こる
    System.out.println(age);

    // コード2-8　異なる型同士の算術演算
    double d2 = 8.5 / 2;
    long l = 5 + 2L;
    System.out.println(d2);
    System.out.println(l);
    
    // コード2-9　文字列の連結
    String msg = "私の年齢は" + 23;
    System.out.println(msg);
    
    // 2-6
    // コード2-10 命令実行文
    String name = "須賀";
    String message = name + "さん、こんにちは";
    System.out.println(message);

    // コード2-11 改行なし画面出力の命令
    String name1 = "菅原";
    System.out.print("私の名前は");
    System.out.print(name1);
    System.out.print("です");

    // コード2-12 大きい方の数値を代入する方法
    int a12 = 5;
    int b12 = 3;
    int m12 = Math.max(a12,b12);
    System.out.println("比較実験:" + a12 +"と" + b12 + "とでは大きい方は…" + m12);

    // コード2-13 String型をint型に変換する命令
    String age13 = "31";
    int n13 = Integer.parseInt(age13);
    System.out.println("あなたは来年、" + (n13+1) + "歳になりますね。");
    
    // コード2-14 ランダムな数を生成する命令
    int r14 = new java.util.Random().nextInt(90);
    System.out.println("あなたはたぶん" + r14 + "歳ですね？");
    
    // コード2-15 キーボードから入力を受け付ける命令
    System.out.println("あなたの名前を入力してください。");
    int name15 = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age15 = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age15 + "歳の" + name15 + "さん");

    // 練習問題2-1
    int x2-1 = 5;
    int y2-1 = 10;
    // String ans = "x+yは" + x + y; は510 → は15 に修正する
    String ans = "x+yは" + (x+y);
    System.out.println(ans);

    // 練習問題2-3
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name23 = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age23 = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました");
    System.out.println(age23 + "歳の" + name23 + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉　2:中吉　3:吉　4凶");
    
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