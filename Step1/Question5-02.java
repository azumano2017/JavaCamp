package section05;

import java.util.Scanner;

public class Question02 {
	//3つのint型引数a,b,cの最小値を求めるメソッドminを作成するプログラム

	public static int min(int a,int b, int c){

		int m = Math.min( a, b );
		int n = Math.min( m, c );
		return n;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);

		System.out.print("整数 a:"); int a = stdln.nextInt();
		System.out.print("整数 b:"); int b = stdln.nextInt();
		System.out.print("整数 c:"); int c = stdln.nextInt();

		System.out.println("最小値は" + min( a, b, c ) + "です。");
	}

}
