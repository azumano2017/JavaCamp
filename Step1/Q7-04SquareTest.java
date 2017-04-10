package section07;

import java.util.Scanner;

public class Q04SquareTest {
	//正方形の外周、面積を求めるプログラム
	//実行クラス

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);

		System.out.print("辺の長さを入力してください：");
		int hen = stdln.nextInt();


		Q04Square s = new Q04Square(hen);

		System.out.print("1辺が " + hen + " の正方形の外周は "
		+ s.getCircum() + "、面積は " + s.getArea() + "です");
	}

}
