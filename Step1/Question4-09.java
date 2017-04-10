package section4;

public class Question09 {

	public static void main(String[] args) {
		// 元旦から今日まで何日たっているか表示するプログラム


		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthsum = 0;
		int sum = 0;

		int tsuki = new java.util.Scanner ( System.in ).nextInt ();  //今日が何月
		int nichi = new java.util.Scanner ( System.in ).nextInt ();  //何日


		for(int i=0; i<tsuki-1; i++){
			monthsum += month[i];
		}

		sum = monthsum + nichi - 1;
		System.out.println("通算日数＝" + sum +"です。");
	}


}
