package section05;

import java.util.Scanner;

public class Question07 {
	//配列aと同じ配列(要素数が同じで、すべての要素の値が同じ配列)を生成して
	//返却するメソッドarrayCloneを生成するプログラム

	public static int[] arrayClone(int[] a){

		int[] y;
		y = a;

		return y;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");

		int num = stdln.nextInt();
		int[] x = new int[num];

		for(int i=0; i<num; i++){
			System.out.print("a[" + i + "]:");
			x[i] = stdln.nextInt();
		}
		int[] y = arrayClone(x);
		System.out.println("配列 x の複製 y を作りました");
		for(int i=0; i<num; i++){
			System.out.println("y[" + i + "]=" + y[i]);
		}

	}
}
