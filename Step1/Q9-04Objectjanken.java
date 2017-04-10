package section09;

public class Q04Objectjanken {
	//オブジェクト指向のジャンケン 実行クラス

	public static void main(String[] args) {
		//問5

		Q02Judge judge = new Q02Judge();  //審判のインスタンス生成

		Q04Murata murata = new Q04Murata("村田さん");  //プレイヤー1(村田さん)の生成
		Q04Yamada yamada = new Q04Yamada("山田さん");  //プレイヤー2(山田さん)の生成

		judge.startJanken( murata, yamada );
	}

}
