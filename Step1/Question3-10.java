package section3;

public class Question10 {
	//キーボードから数字(繰り返し回数)を入力する。
	//入力されて回数分『hello world!!』という文章を表示させるプログラム

	public static void main(String[] args) {

		int a;
		int b;

		a = new java.util.Scanner ( System.in ).nextInt ();
		for (b = 0; b < a; b++) {
			System.out.println("hello world!!");
		}

	}


}
