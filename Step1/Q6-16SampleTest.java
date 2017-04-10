package section06;

public class Q16SampleTest {
	//引数を計算し出力するクラスを利用するプログラム

	public static void main(String[] args) {


		Q16Sample x = new Q16Sample (1, 2, 3);
		Q16Sample y = new Q16Sample (2, 4, 6);

		int xs = x.getSum();
		int ys = y.getSum();

		System.out.print("x:  ");

		x.print();
		System.out.println("xs:" + xs);


		System.out.print("y  :");

		y.print();
		System.out.println("ys:" + ys);
	}

}
