package section3;

public class Question04 {

public static void main(String[] args) {
	//キーボードから入力された2つのデータ x,y に対し
	//x÷yの演算が割り切れるかどうかを判定するプログラム(変数x,y>0)

		int x = new java.util.Scanner ( System.in ).nextInt ();
		int y = new java.util.Scanner ( System.in ).nextInt ();

		if (x % y == 0) {
			System.out.println( x + "は" + y + "で割り切れます。");
		} else {
			System.out.println( x + "は" + y + "で割り切れせません。");
		}

	}

}
