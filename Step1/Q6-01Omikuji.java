package section06;

import java.util.GregorianCalendar;
import java.util.Random;

public class Q01Omikuji {
	//おみくじプログラム
	//今日の日付と、大吉、吉、中吉、小吉、凶のいずれかの運勢を表示するプログラム

	public static void main(String[] args) {

		GregorianCalendar today = new GregorianCalendar();

		int yy = today.get(GregorianCalendar.YEAR);
		int mm = today.get(GregorianCalendar.MONTH)+1;
		int dd = today.get(GregorianCalendar.DATE);
		System.out.println("今日は" +yy + "年" + mm + "月" + dd + "日です。");
		System.out.println("");


		Random rand = new Random();
		int k = rand.nextInt(10);
		System.out.print("今日の運勢は ");

		switch(k){
			case 0:
				System.out.print("大吉"); break;
			case 1: case 2: case 3:
				System.out.print("吉"); break;
			case 4: case 5: case 6:
				System.out.print("中吉"); break;
			case 7: case 8:
				System.out.print("小吉"); break;
			case 9:
				System.out.print("凶"); break;
		}
		System.out.println(" です。");
	}

}
