package section09;

public class Q01SimpleJanmen {
	// オブジェクトを使用しないじゃんけんプログラム


	public static final int STONE = 0;     //グー
	public static final int SCISSORS = 1;  //チョキ
	public static final int PAPER = 2;     //パー





	//プログラムのスタートはここから
	public static void main(String[] args) {

		int point1 = 0;
		int point2 = 0;


		//プログラムが開始したことを表示
		System.out.println("じゃんけんスタート！\n");


		//じゃんけんを3回実施する
		System.out.println("[ グー：0、 チョキ：1、 パー：2 ]");

		for ( int i=1; i<4; i++ ){

			System.out.println("[ " + i + "回目 ]");
			System.out.print("プレイヤー1：");
			int player1 = new java.util.Random().nextInt(3);//プレイヤー1
			System.out.println(player1);

			System.out.print("プレイヤー2：");
			int player2 = new java.util.Random().nextInt(3);//プレイヤー2
			System.out.println(player2);

			if( player1 == 0) {
				switch ( player2 ){
				case 0:
					System.out.println("あいこ\n");
					break;
				case 1:
					System.out.println("プレイヤー1の勝ち(勝ち数＋1)\n");
					point1++;
					break;
				case 2:
					System.out.println("プレイヤー2の勝ち(勝ち数＋1)\n");
					point2++;
					break;
				}
			} else if (player1 == 1 ){
				switch ( player2 ){
				case 0:
					System.out.println("プレイヤー2の勝ち(勝ち数＋1)\n");
					point2++;
					break;
				case 1:
					System.out.println("あいこ\n");
					break;
				case 2:
					System.out.println("プレイヤー1の勝ち(勝ち数＋1)\n");
					point1++;
					break;
				}
			} else {
				switch ( player2 ){
				case 0:
					System.out.println("プレイヤー1の勝ち(勝ち数＋1)\n");
					point1++;
					break;
				case 1:
					System.out.println("プレイヤー2の勝ち(勝ち数＋1)\n");
					point2++;
					break;
				case 2:
					System.out.println("あいこ\n");
				}
			}

		}
		System.out.println("プレイヤー1の勝ち数：" + point1 );
		System.out.println("プレイヤー2の勝ち数：" + point2 );


		System.out.print("[ 最終結果＝");
		if ( point1 > point2 ){
			System.out.print("プレイヤー1の勝ち！！");
		} else if ( point1 < point2 ){
			System.out.print("プレイヤー2の勝ち！！");
		} else {
			System.out.print("あいこ");
		}
		System.out.println(" ]");
	}

}
