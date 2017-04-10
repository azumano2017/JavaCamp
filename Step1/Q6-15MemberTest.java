package section06;

public class Q15MemberTest {
	//会員クラス「Menber」を利用するプログラム
	//実行クラス

	public static void main(String[] args) {


		Q15Member mem = new Q15Member(null, 0, 0);

		mem.suzuki = new Q15Member ("鈴木一郎", 1, 25 );
		mem.tanaka = new Q15Member ("田中大輔", 2, 34 );
		mem.yamada = new Q15Member ("山田花子", 3, 21 );

		mem.print();

	}
}
