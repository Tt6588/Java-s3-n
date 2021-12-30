public class Demo {
	public static void main(String[] args) {
		System.out.println("sugar");
		System.out.println("正体は角砂糖");
		System.out.println("だと本人は思っている…");
		System.out.println("突然ですが砂糖の合計を計算します");
		System.out.println(12 + 3 * 6);
// 		コメント練習

    int age;
    age = 23;
    System.out.println(age);


    final double PI = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    PI = 10; //代入できないエラーが出る
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
	}
}