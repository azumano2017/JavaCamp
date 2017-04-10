package section3;

public class Question06 {
	//キーボードから入力された点数により評価(A,B,C,D)を表示するプログラム
	//80点以上→A、70点以上80点未満→B、60点以上70点未満→C、60点未満→D

	public static void main(String[] args) {

		int input;

		System.out.print("点数を入力してください：");
		input = new java.util.Scanner ( System.in ).nextInt ();

		if (input >= 80) {
			System.out.println("評価はAです。");
		} else if(input >= 70) {
			System.out.println("評価はBです。");
		} else if(input >= 60) {
			System.out.println("評価はCです。");
		} else {
			System.out.println("評価はDです。");
		}

	}

}
