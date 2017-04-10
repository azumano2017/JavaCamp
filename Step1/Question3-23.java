package section3;

public class Question23 {
	//3桁の整数値(100～999)をキーボードから入力し、3桁の整数値でない場合は
	//3桁でないエラーメッセージを出力するプログラム

	public static void main(String[] args) {

		int n;

		n = new java.util.Scanner ( System.in ).nextInt ();

		if ( n < 100 || 1000 < n)  {
			System.out.println("入力されたデータは3ケタの整数値ではありません。");
		} else {
			System.out.println(" ");
		}
	}

}
