package section3;

public class Question20 {
	//最大10個のデータを入力し、合計値と平均値を求めるプログラム
	//データの終わりは0を入力とする

	public static void main(String[] args) {

		int n;
		int sum;
		double avg;
		sum = 0;
		int i;

		for ( i = 0; i <= 10; i++ ) {

			n = new java.util.Scanner ( System.in ).nextInt ();
			if ( n == 0 ) {
				break;
			}else {
				sum += n;
			}
		}

		avg = sum / i;
		System.out.println("合計値＝" + sum + "  平均値＝" + avg);

	}

}
