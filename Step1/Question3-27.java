package section3;

public class Question27 {
	//5段のピラミッドを表示するプログラム

	public static void main(String[] args) {

		int n;

		System.out.println("入力した数と同じ段のピラミッド");
		System.out.print("1～9の数字を入れてください = ");
		n = new java.util.Scanner ( System.in ).nextInt ();

		for ( int i = 1; i < n+1; i++ ) {
			for ( int j = 0; j+i < n; j++ ) {
				System.out.print(" ");
			}
			for ( int k = 0; k < i + i - 1; k++ ) {
				System.out.print(i);
			}
		System.out.println();
		}
	}
}
