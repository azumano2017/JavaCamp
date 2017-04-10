package section3;

public class Question02 {
	//キーボードから入力された整数が偶数か奇数かを判定するプログラム

	public static void main(String[] args) {

		int input;

		input = new java.util.Scanner ( System.in ).nextInt ();

		if (input % 2 == 0) {
			System.out.println("入力されたデータは偶数です。");
		} else {
			System.out.println("入力されたデータは奇数です。");
		}
	}

}
