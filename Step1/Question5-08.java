package section05;

import java.util.Random;

public class Question08 {
	/*
	 * 二つのサイコロの出目で勝ち負けを争う craps というゲームをするプログラム
	 * 1回目の出目の合計が7か11のときは、あなたの勝ち
	 * 1回目の出目の合計が2か3か12のときはコンピュータの勝ち
	 * それ以外(4,5,6,8,9,10)のときは、出目の合計ポイントとして勝負を続行し、再度サイを振る
	 * 2回目以降の出目の合計がポイントと等しいときはあなたの勝ち、7が出たときはコンピュータの勝ち
	 */

	public static void main(String[] args) {

		int point=0;
		// boolean b = true;


		System.out.println("サイを振ります。1回目です。");
		int goukei = rollDice();
		System.out.println("合計" + goukei + "です。" );

		if(goukei==7 || goukei==11){
			System.out.println("あなたの勝ちです。");
		}else if(goukei==2 || goukei==3 || goukei==12){
			System.out.println("コンピュータの勝ちです。");
		}else{
			point = goukei;
//			do{
//				System.out.println("サイを振ります。" + i + "回目です。");
//				goukei = rollDice();
//
//				System.out.println("合計" + goukei + "です。");
//				if(goukei == point){
//					b = false;
//					System.out.println("あなたの勝ちです。");
//				}else if(goukei == 7){
//					b = false;
//					System.out.println("コンピュータの勝ちです。");
//					break;
//				}
//				i++;
//			}while(b);

		for(int i=2; ; i++){
			System.out.println("サイを振ります。" + i + "回目です。");
			goukei = rollDice();
			System.out.println("合計" + goukei + "です。");

		if(goukei == point){
			System.out.println("あなたの勝ちです。");
			break;
		}else if(goukei == 7){
			System.out.println("コンピュータの勝ちです。");
			break;
		}
			}
		}
	}

	public static int rollDice(){

		int sum=0;

		int num1 = new Random().nextInt(6)+1;
		int num2 = new Random().nextInt(6)+1;
			sum = num1 + num2;

		return sum;
	}

}
