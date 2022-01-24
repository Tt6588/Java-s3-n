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
    }
}