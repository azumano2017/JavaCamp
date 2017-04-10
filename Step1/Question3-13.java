package section3;

public class Question13 {
	//1～10までの合計値を求めるプログラム

	public static void main(String[] args) {

		int i;
		int sum;
		sum=0;

		for ( i = 1; i <= 10; i++ ) {
			sum += i;
		}

		System.out.println("合計値＝" + sum);

	}

}
