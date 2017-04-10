package section3;

public class Question22 {
	//2つの整数値をキーボードから入力し、小さいほうの数字～大きいほうの数字までの
	//整数値を出力するプログラム

	public static void main(String[] args) {

		int one;
		int two;

		one = new java.util.Scanner ( System.in ).nextInt ();
		two = new java.util.Scanner ( System.in ).nextInt ();

		if ( one < two ) {
			System.out.println("結果＝" + one + "  " + two);
		} else {
			System.out.println("結果＝" + two + "  " + one);
		}

	}

}
