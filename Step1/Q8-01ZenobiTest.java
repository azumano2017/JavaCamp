package section08;

import java.util.Scanner;

public class Q01ZenobiTest {
	//顧客を前年の購入実績に応じて、特典会員に分類し割引する
	//実行クラス

	public static void main(String[] args) {

		Scanner scan = new Scanner ( System.in );
		System.out.printf("金額を入力してください：");

		int myPrice = scan.nextInt();
		Q01Zenobia[] zen = { new Q01Bronze(), new Q01Silver(), new Q01Gold() };

		for ( int i=0; i<zen.length; i++ ){
			zen[i].calcPrice ( myPrice );
		}

	}

}
