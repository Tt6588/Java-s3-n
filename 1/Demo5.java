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

    // 5-10 オーバーロード(引数の型が異なる場合)
    System.out.println(add10(10,20));
    System.out.println(add10(3.5,2.7));
    System.out.println(add10("Hello","World"));

    // 5-11 オーバーロード(引数の数が異なる場合)
    System.out.println("10+20="+ add11(10,20));
    System.out.println("10+20+30=" + add11(10,20,30));

    // 5-12 引数に配列を受け取るメソッドの利用
    int[] array12 = {1,2,3};
    printArray12(array12);
    
    // 5-13 同じ配列を参照していることを確認する
    int[] array13 = {1,2,3};
    incArray13(array13);
    for(int i : array13){
      System.out.println(i);
    }
    
    // 5-14 戻り値が配列の場合
    int[] array14 = makeArray14(3);
    for(int i : array14){
      System.out.println(i);
    }
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

    // 5-9 return後に処理はかけない　エラーコード
    // int z = 20;
  }
  
  // 5-10
  public static int add10(int x, int y){
    return x + y;
  }
  public static double add10(double x, double y){
    return x + y;
  }
  public static String add10(String x, String y){
    return x + y;
  }
  
  // 5-11
  public static int add11(int x, int y){
    return x + y;
  }
  public static int add11(int x, int y, int z){
    return x + y + z;
  }
  
  // 5-12
  public static void printArray12(int[] array12){
    for(int element : array12){
      System.out.println(element);
    }
  }

  // 5-13
  public static void incArray13(int[] array13){
    for(int i = 0; i < array13.length; i++){
      array13[i]++;
    }
  }
  
  // 5-14
  public static int[] makeArray14(int size){
    int[] newArray14 = new int[size];
    for(int i = 0; i < newArray14.length; i++){
      newArray14[i] = i;
    }
    return newArray14;
  }
}