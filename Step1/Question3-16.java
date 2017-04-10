package section3;

public class Question16 {
	//10個のデータをキーボードより入力し、合計値と平均値を求めるプログラム

	public static void main(String[] args) {

		int n;
		int sum;
		double avg;
		sum = 0;

		for ( int i = 0; i < 10; i++ ) {
			n = new java.util.Scanner ( System.in ).nextInt ();
			sum += n;
		}

		System.out.println("合計値＝" + sum );
		avg = sum / 10.0;
		System.out.println("平均値＝" + avg );
	}

}
