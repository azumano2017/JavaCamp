package section05;

import java.util.Scanner;

public class Question04 {
	//引数mで指定された月の季節を表示するメソッドprintSeasonを作成するプログラム

	public static void printSeason(int m){

		if(3 <= m  && m <= 5) {
			System.out.print("春");
		}else if (6 <= m  && m <= 8) {
			System.out.print("夏");
		}else if (9 <= m  && m <= 11) {
			System.out.print("秋");
		}else if (m <= 2 || m == 12) {
			System.out.print("冬");
		}
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		int month;

		do{
			System.out.print("何月ですか (1～12) :");
			month = stdln.nextInt();
		}while (month < 1 || month > 12);

		System.out.print("その月の季節は");
		printSeason(month);
		System.out.print("です。");
	}

}
