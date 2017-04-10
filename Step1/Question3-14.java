package section3;

public class Question14 {
	//1～10までの合計値と平均値を求めるプログラム

	public static void main(String[] args) {

		int i;
		int sum;
		sum=0;
		double avg;

		for ( i = 1; i <= 10; i++ ) {
			sum = sum + i;
		}

		System.out.println("合計値＝" + sum );
		avg = sum / 10.0;
		System.out.println("平均値＝" + avg );
	}

}
