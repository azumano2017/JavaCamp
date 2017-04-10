package section09;

public class Q05RandomTactics implements Q05Tactics{
	//インターフェースを使ったプログラム

	/*
	 * グー・チョキパーのいずれかをPlayerクラスに定義された以下の定義で返す
	 * Player.STONE ... グー
	 * Plyaer.SCISSORS ... チョキ
	 * Plyaer.PAPER ... パー
	 */

	public int readTactics(){  //オーバーライド
		int hand = 0;
		double randomNum = Math.random()*3;

		if ( randomNum < 1 ){
			hand = Q05Player.STONE;      //randomNumが0以上1未満の場合、グー
		} else if ( randomNum <2 ){
			hand = Q05Player.SCISSORS;   //randomNumが1以上2未満の場合、チョキ
		} else if ( randomNum < 3 ){
			hand = Q05Player.PAPER;      //randomNumが2以上3未満の場合、パー
		}
		return hand;
	}

}
