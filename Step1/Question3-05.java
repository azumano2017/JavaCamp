package section3;

public class Question05 {
	//キーボードから入力された整数が2桁の数字かそうでないかを判定するプログラム

	public static void main(String[] args) {

		int input;

		input = new java.util.Scanner ( System.in ).nextInt ();

		if (10 <= input  && input <= 99) {
			System.out.println("入力されたデータは2ケタの数字です。");;
		} else {
			System.out.println("入力されたデータは2ケタの数字ではありません。");
		}

	}

}
