public class Demo2 {
	public static void main(String[] args) {
	   // 私の好きな記号は二重引用符が文字列とみなされる
	    System.out.rintln("私の好きな記号は二重引用符(")です");
	    
	   // ￥によつて二重引用符は文字とみなされる
	    System.out.rintln("私の好きな記号は二重引用符(¥")です");
			
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
	}
}