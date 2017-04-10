package section4;

public class Question10 {

	public static void main(String[] args) {
		// 元旦から今日まで何日たっているか表示するプログラム


		int[] month = { 31, 60, 91, 121, 151, 182, 213, 244, 274, 305, 335, 366 };
		int monthsum = 0;
		int sum = 0;

		System.out.println("元旦から今日まで何日建っているか");
		System.out.print("月：");
		int tsuki = new java.util.Scanner ( System.in ).nextInt ();  //今日が何月
		System.out.print("日：");
		int nichi = new java.util.Scanner ( System.in ).nextInt ();  //何日


		if( tsuki == 1 ){
			sum = nichi-1;
		}else{
			sum  = month[tsuki-2] + nichi - 1;
		}
		System.out.println("通算日数＝" + sum +"です。");

	}

}
