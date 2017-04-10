package section06;

import java.util.Scanner;

public class Q07CubeRootTest {
	//キーボードから入力した整数の立方根を求めるプログラム
	//実行クラス

	public static void main(String[] args) {

		System.out.print("数字を入力してください → ");
		Scanner stdln = new Scanner( System.in );
		int num = stdln.nextInt();

		Q07CubeRoot mc = new Q07CubeRoot(num);
		mc.display();

	}

}
