package section3;

public class Question18 {
	//10個のデータをキーボードより入力し、最小値を求めるプログラム

	public static void main(String[] args) {

		int n;
		int mini;

		mini = new java.util.Scanner ( System.in ).nextInt ();

		for ( int i = 0; i < 9; i++ ) {
			n = new java.util.Scanner ( System.in ).nextInt ();

			if ( n < mini ) {
				mini = n;
			}
		}

		System.out.println("最小値＝" + mini );

	}


}
