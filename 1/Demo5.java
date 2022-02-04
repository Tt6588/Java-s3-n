public class Demo4 {

  public static void main(String[] args) {
    // 5-2 メソッドの呼び出し
    System.out.println("メソッドを呼び出します");

    // 5-3 mainメソッド以外からメソッドを呼び出す
    methodA();
    System.out.println("メソッドを呼び出しました");

    // 5-4 引数の例(わたす値が1つの場合)
    hello("奏");
    hello("朝香");
    hello("菅原");

    // 5-5 引数の例(わたす値が複数の場合)
    add(100, 20);
    add(200, 50);

    // 5-7 戻り値の例
    int ans7 = add7(150,10);
    System.out.println("150+10=" + ans7);
    
    // 5-8 戻り値をそのまま使う
    System.out.println(add8(add8(10,20),add8(30,40)));
  }

  
  // 5-1 シンプルなメソッドの定義
  // public static void hello(){
  //   System.out.println("奏さんこんにちは");
  public static void hello(String name){
    System.out.println(name + "さん、こんにちは");
  }

  // 5-3
  public static void methodA(){
    System.out.println("methodA");
    methodB();
  }
  public static void methodB(){
    System.out.println("methodB");
  }

  // 5-5
  public static void add(int x, int y){
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }

  // 5-6 引数を使わずに値を渡せないのか　エラーコード
  // public static void main(String[] args){
  //   int x = 100;
  //   int y = 10;
  //   add ();
  // }
  // public static void add(){
  //   int ans = x + y;
  //   System.out.println(x + "+" + y + "=" + ans);
  // }

  // 5-7
  public static int add7(int x, int y){
    int ans7 = x + y;
    return ans7;
  }
  
  // 5-8
  public static int add8(int x, int y){
    int ans8 = x + y;
    return ans8;
  }
}