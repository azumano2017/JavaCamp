package section3;

public class Question24 {
	//キーボードから入力した値だけ * を出力するプログラム

	public static void main(String[] args) {

		int n;
		int i;

		n = new java.util.Scanner ( System.in ).nextInt ();

		for (i = 0; i < n; i++) {
			System.out.print("* ");
		}

	}

}
