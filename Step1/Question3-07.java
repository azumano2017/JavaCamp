package section3;

public class Question07 {
	/*ネットショップの支払い金額を計算し表示するプログラム
	  買い上げ金額が3,000以上の場合は送料無料
	  3,000円未満の場合は送料500円
	  消費税は8％
	*/

	public static void main(String[] args) {

		int x;
		int y;
		double z;

		System.out.print("金額を入力して下さい：");
		x = new java.util.Scanner ( System.in ).nextInt ();

		if (x >= 3000) {
			y = x;
		} else {
			y = x + 500;
		}
		z = y * 1.08;
		y = (int) z;
		System.out.println("支払金額は、" + y + "円です。");
	}

}
