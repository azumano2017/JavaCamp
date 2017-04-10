package section09;

public class Q03ObjectJanken {
	//オブジェクト指向版ジャンケンプログラム

	public static void main(String[] args) {

		Q02Judge saito = new Q02Judge();   //審判(斎藤さん)のインスタンス生成

		Q02Player murata = new Q02Player("村田さん");  //プレイヤー1(村田さん)の生成
		Q02Player yamada = new Q02Player("山田さん");  //プレイヤー2(山田さん)の生成

		//村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken( murata, yamada );

	}

}
