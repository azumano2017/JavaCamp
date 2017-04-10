package section08;

public class Q01Bronze extends Q01Zenobia{
	//顧客を前年の購入実績に応じて、特典会員に分類し割引する
	//Zenobiaクラスを継承したブロンズクラス(5％引き)


	String grade = "ブロンズ";

	void calcPrice ( int price ){
		showPrice ( grade, (int)( price * ( 1 - 0.03 )) );
	}

}
