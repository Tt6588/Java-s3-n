import java.util.*;

public class PaizaPractise {
  public static void main(String[] args) {

    // ----D----

    // D182:燃費の計算
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int x = n / m;
    System.out.println(x);
    scanner.close();

    // D156:密度の計算
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = N * M;
    System.out.println(X);

    // D172:イヴの日付
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    N--;
    System.out.println(N);

    // D189:何周年の確認
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = y - x;
    System.out.println(z);

    // D162:【推しプロコラボ問題】お米の重さ
    int N = new java.util.Scanner(System.in).nextInt();
    int X = N * 150;
    System.out.println(X);

    // D182:燃費の計算
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int x = n / m;
    System.out.println(x);
    scanner.close();

    // ----C----

    // C084:【キャンペーン問題】枠で囲む
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String N = "++";
    for (int i = 0; i < S.length(); i++) {
      N = N + "+";
    }
    System.out.println(N);
    System.out.println("+" + S + "+");
    System.out.println(N);

    // C020:残り物の量
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int p = sc.nextInt();
    int q = sc.nextInt();
    double x1 = m - (m * (p * 0.01));
    double x2 = ((double) Math.round(x1 * 100)) / 100;
    double y = x2 - (x2 * (q * 0.01));
    System.out.println(y);

    // C016:Leet文字列
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String x = s.replace("A", "4").replace("E", "3").replace("G", "6").replace("I", "1").replace("O", "0")
        .replace("S", "5").replace("Z", "2");
    System.out.println(x);

    // C086:ハンドルネームの生成
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String x = s.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
    String y = x.replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "");
    System.out.println(y);
  }
}