package section3;

public class Question21 {
	//正の整数値をキーボードより入力し、桁数を求めるプログラム

	public static void main(String[] args) {

		int n;
		int i = 0;
		int x;

		n = new java.util.Scanner ( System.in ).nextInt ();
		x = n;

		while ( x > 0 ) {
			x /= 10;
			i += 1;
		}

		System.out.println("整数 " + n + " の桁数は、" + i + "ケタです。");
	}

}
