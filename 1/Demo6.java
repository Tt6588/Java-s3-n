// 6-5 パッケージ
// package calcapp.main;

public class Demo6 {

  // 6-1 計算機プログラム
  // public static void Main(String[] args){
  //   int a = 10; int b = 2;
  //   int total = tasu(a,b);
  //   int delta = hiku(a,b);
  //   System.out.println("足すと" + total + "、引くと" + delta);
  // }
  // public static int tasu(int a, int b){
  //   return (a + b);
  // }
  // public static int hiku(int a, int b){
  //   return (a - b);
  // }

  // 6-3 mainメソッドだけ残された　Demo6.java
  // 6-4 修正後　Demo6.java
  // 6-7 修正後　Demo6.java
  public static void main(String[] args){
    int a = 10; int b = 2;
    int total = Demo6CalcLogic.tasu(a,b); 
    int delta = Demo6CalcLogic.hiku(a,b); 
    // int total = calcapp.logics.Demo6CalcLogic.tasu(a,b); //修正
    // int delta = calcapp.logics.Demo6CalcLogic.hiku(a,b); //修正
    System.out.println("足すと" + total + "、引くと" + delta);

  }
}