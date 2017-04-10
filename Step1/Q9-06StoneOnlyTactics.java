package section09;

public class Q06StoneOnlyTactics implements Q05Tactics{

	/*
	 * 戦略を読み、ジャンケンの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す
	 * Player.STONE ... グー
	 * Plyaer.SCISSORS ... チョキ
	 * Plyaer.PAPER ... パー
	 */


	public int readTactics(){
		return Q05Player.STONE;
	}

}
