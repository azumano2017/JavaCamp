package section3;

public class Question15 {
	//1～nまでの合計値と平均値を求めるプログラム
	//但し、nの値はキーボードより入力する

	public static void main(String[] args) {

		int n;
		int i;
		int sum;
		sum=0;
		double avg;

		n = new java.util.Scanner ( System.in ).nextInt ();

		for ( i = 1; i <= n; i++ ) {
			sum = sum + i;
		}

		System.out.println("合計値＝" + sum );
		avg = sum / (double)n;
		System.out.println("平均値＝" + avg );

	}

}
