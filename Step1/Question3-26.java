package section3;

public class Question26 {
	//キーボードより月(month)を入力し、月に対応する季節を出力するプログラム
	//春(3月～5月)、夏(6月～8月)、秋(9月～11月)、冬(12月～2月)

	public static void main(String[] args) {

		int month;

		System.out.println("月に対応する季節を入力するプログラム");

		System.out.print("month = ");
		month = new java.util.Scanner ( System.in ).nextInt ();

		if ( 1 <= month && month <= 12) {
			if ( 3 <= month  && month <= 5 ) {
				System.out.println("春ですね");
			} else if ( 6 <= month  && month <= 8 ) {
				System.out.println("夏ですね");
			} else if ( 9 <= month  && month <= 11 ) {
				System.out.println("秋ですね");
			} else if ( month <= 2 || month == 12 ) {
				System.out.println("冬ですね");
			}
		} else {
			System.out.println("エラー");
		}
	}
}
