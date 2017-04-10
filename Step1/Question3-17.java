package section3;

public class Question17 {
	//10個のデータをキーボードより入力し、最大値を求めるプログラム

	public static void main(String[] args) {

		int n;
		int max;
		max = 0;

		for ( int i = 0; i < 10; i++ ) {
			n = new java.util.Scanner ( System.in ).nextInt ();
			if ( n > max ) {
				max = n;
			}
		}

		System.out.println("最大値＝" + max );
	}


}
