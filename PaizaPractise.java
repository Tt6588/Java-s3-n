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
    }
}