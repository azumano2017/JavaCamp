package section4;

public class Question11 {
	//売上総額を求めるプログラム

	public static void main(String[] args) {

		int[]tanka = {100, 150, 200, 250, 300};
		int[]suryo = {200, 300, 140, 60, 350};
		int[] sum = new int[5];
		int today  =0;

		for(int i=0; i<tanka.length; i++){
			sum[i] = tanka[i] * suryo[i];
			today += sum[i];

		}
		System.out.println("売上データ＝" + today + "円です。");

	}
}
