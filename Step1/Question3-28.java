package section3;

public class Question28 {
	//キーボードから入力された整数値(n)が素数であるかどうかを判定するプログラム

	public static void main(String[] args) {

		int n;

		System.out.print("入力した数字が素数かどうか→");
		n = new java.util.Scanner ( System.in ).nextInt ();

		for (int i = 2; i <= n; i++){
			if ( i == n ) {
				System.out.println("素数です");
			} else if ( n % i ==0 ) {
				System.out.println("素数ではありません");
				break;
			}
		}
	}

}
