package section09;

public class Q06ObjectJanken {

	public static void main(String[] args) {
		// 問6-3  戦略を生成してプレイヤーへ渡す

		Q06Judge judge = new Q06Judge();  //審判インスタンスの生成


		Q05Player murata = new Q05Player ("村田さん");  //プレイヤー1(村田さん)の生成
		Q06CyclicTactics murataTactics = new Q06CyclicTactics();  //村田さんに渡す戦略クラスを生成

		murata.setTactics ( murataTactics );


		Q05Player yamada = new Q05Player ("山田さん");  //プレイヤー2(山田さんの)生成
		Q06CyclicTactics yamadaTactics = new Q06CyclicTactics(); //山田さんに渡す戦略クラスを生成

		yamada.setTactics ( yamadaTactics );


		judge.startJanken( murata, yamada );



	}

}
