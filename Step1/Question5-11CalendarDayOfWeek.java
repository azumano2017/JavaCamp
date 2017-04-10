package section05;

import java.util.Calendar;
import java.util.Scanner;

public class Question11CalendarDayOfWeek {
	//キーボードより入力した年月のカレンダーを表示するプログラム


	// java.util.Calendar クラスで定義している曜日の定数配列
	private static final int[] WEEK = {	Calendar.SUNDAY,
										Calendar.MONDAY,
										Calendar.TUESDAY,
										Calendar.WEDNESDAY,
										Calendar.THURSDAY,
										Calendar.FRIDAY,
										Calendar.SATURDAY,};

	// 曜日の日本語表記配列
	public static final String[] WEEK_JA = {"日","月","火","水","木","金","土"};

	public static void main(String[] args) {

		Question11CalendarDayOfWeek ct = new Question11CalendarDayOfWeek();

		Scanner stdln = new Scanner(System.in);

		System.out.print("年：");   // 年、月を入力
		int y = stdln.nextInt();
		System.out.print("月：");
		int m = stdln.nextInt();
		System.out.println("");


		for(int i=0; i<WEEK_JA.length; i++){
			System.out.print(" " + WEEK_JA[i]);
		}

		System.out.println("");   // 日～土を表示


		Calendar cal = Calendar.getInstance(); // Calendarインスタンスの作成
		cal.set(Calendar.YEAR,y);         // YEARにyをセット
		cal.set(Calendar.MONTH,m-1);      // MONTHにm-1をセット
		cal.set(Calendar.DATE, 1);        // 1をDATEにセット


		//String day = ct.getDayOfWeek( y, m, 1);  /*  getDayOfWeekメソッドの結果をdayに返す
		                                       //  [return 入力した月が何日始まりか]  */

		int index = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i<index; i++) {
			System.out.printf("%3s", "");    // 1週目の1日までを" "で埋める
		}

		int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		                                       // 入力した月が何日までか

	    for (int i = 1; i <= maxday; i++) {    // 最終日まで繰り返す
			System.out.printf("%3s", i);
			cal.set(Calendar.DATE, i);

			if (Calendar.SATURDAY == cal.get(Calendar.DAY_OF_WEEK)) {
				System.out.println("");        // 土曜日で改行
			}
		}
	}

	/*
	public String getDayOfWeek(int y, int m, int d){

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR,y);
		cal.set(Calendar.MONTH,m-1);
		cal.set(Calendar.DAY_OF_MONTH,d);

		int w = cal.get(Calendar.DAY_OF_WEEK);

		for(int i=0; i<CalendarDayOfWeek.WEEK.length; i++){ //その月の週分にな
			if(w == CalendarDayOfWeek.WEEK[i]){
				return CalendarDayOfWeek.WEEK_JA[i];
			}
		}

		return null;
	}
	*/

}
