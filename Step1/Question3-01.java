package section3;

public class Question01 {
	//キーボードから入力された変数が正か負かを判定するプログラム(変数 x≠0)

	public static void main(String[] args) {
		int input;

		input = new java.util.Scanner ( System.in ).nextInt ();
		if (input > 0) {
			System.out.println("入力されたデータは正の数です。");
		} else {
			System.out.println("入力されたデータは負の数です。");
		}
	}

}
