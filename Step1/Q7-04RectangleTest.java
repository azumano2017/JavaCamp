package section07;

import java.util.Scanner;

public class Q04RectangleTest {
	//長方形の外周、面積を求めるプログラム
	//実行クラス

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);

		System.out.print("横の長さを入力してください：");
		int yoko = stdln.nextInt();
		System.out.print("縦の長さを入力してください：");
		int tate = stdln.nextInt();


		Q04Rectangle r = new Q04Rectangle(yoko, tate);

		System.out.println("横 " + r.getWidth() + "  縦 " + r.getHeight()
		+ "の長方形の外周は " + r.getCircum() + "、面積は " + r.getArea() + "です");
	}

}
