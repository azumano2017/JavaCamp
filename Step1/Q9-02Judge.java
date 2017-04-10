package section09;

public class Q02Judge {

	public void startJanken ( Q02Player player1, Q02Player player2){

		System.out.println("【ジャンケン開始】\n");

		for (int cnt = 0; cnt < 3; cnt++){   //ジャンケンを3回行う
			System.out.println("【" + (cnt+1) + "回戦目】");  //何回目か表示

			//プレイヤーの手を見て、どちらが勝ちかを判定する
			Q02Player winner = judgeJanlen (player1, player2); //judgeJankenメソッドを実行
			if ( winner != null ){
				System.out.println("\n" + winner.getName() + "が勝ちました！\n");
				winner.notifyResult(true);
			} else {
				System.out.println("\n引き分けです！\n");
			}

		}
		System.out.println("【ジャンケン終了】\n");

		//最終的な勝者を判定する
		Q02Player finalWinner = judgeFinalWinner( player1,player2 );
		//結果の表示
		System.out.print( player1.getWinCount() + " 対 " + player2.getWinCount() + "で");
			if ( finalWinner != null ){
				System.out.println( finalWinner.getName() + "の勝ちです！\n");
			} else {
				System.out.println("引き分けです！\n");
			}
	}



	public Q02Player judgeJanlen ( Q02Player player1, Q02Player player2){

		Q02Player winner = null;

		int player1hand = player1.showHand();
		int player2hand = player2.showHand();

		//それぞれの手を表示する
		printHand ( player1hand );
		System.out.print(" vs ");
		printHand ( player2hand );
		System.out.print("\n");


		//プレイヤー1が勝つ場合
		if ( ( player1hand == Q02Player.STONE && player2hand == Q02Player.SCISSORS )
			|| ( player1hand == Q02Player.SCISSORS && player2hand == Q02Player.PAPER )
			|| ( player1hand == Q02Player.PAPER && player2hand == Q02Player.STONE) ){
			winner = player1;
		}

		//プレイヤー2が勝つ場合
		else if ( ( player1hand == Q02Player.STONE && player2hand == Q02Player.PAPER )
			|| ( player1hand == Q02Player.SCISSORS && player2hand == Q02Player.STONE )
			|| ( player1hand == Q02Player.PAPER && player2hand == Q02Player.SCISSORS ))
			winner = player2;

		return winner;    //どちらでもない場合は引き分け(nullを返す)
	}


	public Q02Player judgeFinalWinner ( Q02Player player1, Q02Player player2){
		Q02Player winner = null;

		int player1WinCount = player1.getWinCount();
		int player2WinCount = player2.getWinCount();

		if ( player1WinCount > player2WinCount ){
			winner = player1;    //プレイヤー1の勝ち
		} else if ( player1WinCount < player2WinCount ){
			winner = player2;    //プレイヤー2の勝ち
		}
		return winner;    //どちらでもない場合nullを返す
	}


	private void printHand ( int hand ){
		switch ( hand ){
		case Q02Player.STONE:
			System.out.print("グー");
			break;
		case Q02Player.SCISSORS:
			System.out.print("チョキ");
			break;
		case Q02Player.PAPER:
			System.out.print("パー");
		default:
			break;
		}
	}
}
