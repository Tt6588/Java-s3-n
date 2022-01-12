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
  }
}