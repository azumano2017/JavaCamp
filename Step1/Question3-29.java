package section3;

import java.util.Random;

public class Question29 {
	//数あてゲームプログラム

	public static void main(String[] args) {

		int n;
		int i = 0;
		int r;

		System.out.println("数あてプログラム");
		r = new Random().nextInt(11);
		System.out.println("0～10までの数を当ててください");

		System.out.print("入力→");

		do{
			n = new java.util.Scanner ( System.in ).nextInt ();
			if ( n < r ) {
				System.out.println("もっと大きな数です。");
			} else if (n > r) {
				System.out.println("もっと小さな数です。");
			}
			i += 1;

		}while ( r != n );
			System.out.print("当たりです！！" + i + "回目で当たりました。");
	}

}
