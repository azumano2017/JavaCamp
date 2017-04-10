package section3;

public class Question03 {
	//キーボードから入力された整数が10の倍数かそうでないかを判定するプログラム

	public static void main(String[] args) {

		int input;

		input = new java.util.Scanner ( System.in ).nextInt ();

		if (input % 10 == 0) {
			System.out.println("入力されたデータは10の倍数です。");
		} else {
			System.out.println("入力されたデータは10の倍数ではないです。");
		}
	}

}
