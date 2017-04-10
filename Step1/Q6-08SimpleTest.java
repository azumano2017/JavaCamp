package section06;

public class Q08SimpleTest {
	//別クラスでコンストラクタを定義するプログラム
	//実行クラス

	public static void main(String[] args) {

		int x = 5;

		Q08Simple mc = new Q08Simple(x);


		Q08Simple.x += 10;
		System.out.printf("x = " + Q08Simple.x);

	}

}
