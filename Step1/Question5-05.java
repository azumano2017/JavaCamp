package section05;

import java.util.Scanner;

public class Question05 {
	//配列の全要素の合計を求めるメソッドsumOfを作成するプログラム

	public static int sumOf(int []a){

		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}



	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");

		int num = stdln.nextInt();
		int[] x = new int[num];

		for(int i=0; i<num; i++){
			System.out.print("x[" + i + "]:");
			x[i] = stdln.nextInt();

		}
		System.out.print("全要素の合計は" + sumOf(x) + "です");
	}

}
