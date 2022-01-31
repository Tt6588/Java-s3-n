public class Demo4 {
  public static void main(String[] args) {
    
    // 4-1 点数管理プログラム
    int sansu = 20;
    int kokugo = 30;
    int rika = 40;
    int eigo = 50;
    int syakai = 80;
    int sum = sansu + kokugo + rika + eigo + syakai;
    int avg = sum / 5;
    System.out.println("合計点" + sum);
    System.out.println("平均点" + avg);
    
    // 4-2 配列の作成手順
    int[] scores42; //変数の定義
    scores42 = new int[5]; //int型の要素を作成
    
    // 4-3 配列の作成手順省略
    int[] scores43 = new int[5]; //変数の定義+int型の要素を作成
    
    // 4-4 配列の長さを調べる
    int[] scores44 = new int[5];
    int num44 = scores44.length;
    System.out.println("要素の数" + num44);
    
    // 4-5 配列の要素に値を代入
    int[] scores45;
    scores45 = new int[5];
    scores45[1] = 30;
    System.out.println(scores45[1]);
    
    // 4-6 初期化されていない変数を利用(エラーコード)
    // int x46;
    // System.out.println(x46);
    
    // 4-7 配列は自動的に初期化される
    int[] scores47 = new int[5];
    System.out.println(scores47[0]);

    // 4-8 配列を用いた点数管理プログラム(エラーコード)
    // int[] scores48 = {20, 30, 40, 50, 80};
    // int sum48 = scores48[1]+scores48[2]+scores48[3]+scores48[4]+scores48[5];
    //     //配列要素の添え字が間違っている
    // int avg48 = sum48 / scores48.length;
    // System.out.println("合計点" + sum48);
    // System.out.println("平均点" + avg48);

    // 4-9 for文を用いた配列
    int[] scores49 = {20, 30, 40, 50, 80};
    for (int i = 0; i < scores49.length; i++){
      System.out.println(scores49[i]);
    }
    
    // 4-10 for文を用いた点数管理プログラム
    int[] scores410 = {20, 30, 40, 50, 80};
    int sum410 = 0;
    for (int i = 0; i < scores410.length; i++){
      sum410 += scores410[i];
    }
    int avg410 = sum410 / scores410.length;
    System.out.println("合計点" + sum410);
    System.out.println("平均点" + avg410);
    
    // 4-11 50点以上の科目を調べる
    int[] scores411 = {20, 30, 40, 50, 80};
    int count411 = 0;
    for (int i = 0; i < scores411.length; i++){
      if (scores411[i] >= 50){
        count411++;
      }
    }
    System.out.println("50点以上の科目の数は：" + count411);
    
    // 4-12-1 DNAの記号をランダムに表示する
    int[] seq = new int[10];
      // 塩基配列をランダムに作成
    for(int i = 0; i < seq.length; i++){
      seq[i] = new java.util.Random().nextInt(4);
    }
      // 生成した塩基配列の記号を表示する
    for(int i = 0; i < seq.length; i++){
      switch (seq[i]){
        case 0:
          System.out.print("A ");
          break;
        case 1:
          System.out.print("T ");
          break;
        case 2:
          System.out.print("G ");
          break;
        case 3:
          System.out.print("C ");
          break;
      }
    }
    
    // 4-12-2 DNAの記号をランダムに表示する　省略
    int[] seq412 = new int[10];
      // 塩基配列をランダムに作成
    for(int i = 0; i < seq412.length; i++){
      seq412[i] = new java.util.Random().nextInt(4);
    }
      // 生成した塩基配列の記号を表示する
    for(int i = 0; i < seq412.length; i++){
      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[seq412[i]] + " ");
    }

    // 4-13 従来for文
    int[] scores413 = {20, 30, 40, 50, 80};
    for (int i = 0; i < scores413.length; i++){
      System.out.println(scores413[i]);
    }
    
    // 4-14 拡張for文
    int[] scores414 = {20, 30, 40, 50, 80};
    for (int value : scores414){
      System.out.println(value);
    }
    
  }
}