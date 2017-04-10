package section05;

import java.util.Scanner;

public class Question10MyOverload2 {
	//オーバーロードの利用
	//引数により異なる図形の面積を表示するプログラム

	public static int myArea(int x){
		int en = (int)(x * x * 3.14);
		return en;
	}



	public static int myArea(int x, int y){
		int tyouhou = x * y;
		return tyouhou;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);

		System.out.println("整数の個数を入力してください(1 or 2)");
		int num = stdln.nextInt();

		if(num == 1){
			System.out.println("円の面積を求めます。");
			System.out.print("x = ");
			int x = stdln.nextInt();
			System.out.println("円の面積は" + myArea(x) + "㎠です。");

		}else if(num == 2){
			System.out.println("円と長方形の面積を求めます。 ");
			System.out.print("x = ");
			int x = stdln.nextInt();
			System.out.print("y = ");
			int y = stdln.nextInt();
			System.out.println("長方形の面積は" + myArea(x, y) + "㎠です。");

		}else{
			System.out.println("エラー");
		}
	}


}
