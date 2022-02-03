public class Demo4 {

  // 5-3 mainメソッド以外からメソッドを呼び出す
  public static void methodA(){
    System.out.println("methodA");
    methodB();
  }
  public static void methodB(){
    System.out.println("methodB");
  }

  public static void main(String[] args) {
    // 5-2 メソッドの呼び出し
    System.out.println("メソッドを呼び出します");
    hello();
    methodA();
    System.out.println("メソッドを呼び出しました");
  }
  
  // 5-1 シンプルなメソッドの定義
  public static void hello(){
    System.out.println("奏さんこんにちは");
  }
}