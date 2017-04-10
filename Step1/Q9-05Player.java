package section09;

public class Q05Player {
	//インターフェースを使ったプログラム

	public static final int STONE = 0;    //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2;    //パー


	private String name_;       //プレイヤーの名前
	private int winCount_ = 0;  //プレイヤーの勝った回数
	private Q05Tactics tactics_;   //与えられた戦略



	public Q05Player ( String name ){  //プレイヤークラスのコンストラクタ
		this.name_ = name;
	}


	void setTactics ( Q05Tactics tactics){
		this.tactics_ = tactics;

	}


	public int showHand(){   //じゃんけんの手を出す

		int hand = this.tactics_.readTactics();
		return hand;
	}


	public void notifyResult ( boolean result ){
		                         //審判から勝敗を聞く(true:勝ち、false:負け)
		if ( true == result ) {
			winCount_++;
		}
	}


	public int getWinCount(){  //自分の買った回数を求める
		return winCount_;
	}


	public String getName(){  //自分の名前を答える
		return name_;
	}

}
