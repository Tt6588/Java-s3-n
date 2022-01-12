public class Demo3 {
  public static void main(String[] args) {
    // インクリメント演算子
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
    
    // コード2-10 命令実行文
    String name = "須賀";
    String message = name + "さん、こんにちは";
    System.out.println(message);
  }
}