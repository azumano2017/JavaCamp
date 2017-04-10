package section09;

public class Q02Player {
	//プレイヤークラス

	public static final int STONE = 0;    //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2;    //パー


	private String name_;       //プレイヤーの名前
	private int winCount_ = 0;  //プレイヤーの勝った回数



	public Q02Player ( String name ){  //プレイヤークラスのコンストラクタ
		this.name_ = name;
	}


	public int showHand(){   //じゃんけんの手を出す

		int hand = 0;
		hand = new java.util.Random().nextInt(3);
		return hand;
	}


	public void notifyResult ( boolean result ){
		                         //審判から勝敗を聞く(true:勝ち、false:負け)
		if ( true == result ) {
			winCount_++;
		}
	}


	public int getWinCount(){  //自分の勝った回数を求める
		return winCount_;
	}


	public String getName(){  //自分の名前を答える
		return name_;
	}

}
