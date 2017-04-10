package section3;

public class Question19 {
	//n個のデータをキーボードより入力し、合計値と平均値を求めるプログラム
	//但し、nの値もキーボードから入力する

	public static void main(String[] args) {

		int data;
		int n;
		int sum;
		double avg;
		sum = 0;

		System.out.print("何個のデータですか:");
		n = new java.util.Scanner ( System.in ).nextInt ();

		for ( int i = 0; i < n; i++ ) {
			data = new java.util.Scanner ( System.in ).nextInt ();
			sum += data;
		}

		System.out.println("合計値＝" + sum );
		avg = sum / (double)n;
		System.out.println("平均値＝" + avg );

	}

}
