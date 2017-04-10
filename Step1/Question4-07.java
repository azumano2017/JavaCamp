package section4;

import java.util.Random;

public class Question07 {
	//要素数がint型である配列を作り、全要素を1～10の乱数で埋めるプログラム

	public static void main(String[] args) {

		int x;
		int r;
		int[] a;

		System.out.print("要素数：");
		x = new java.util.Scanner ( System.in ).nextInt ();  //要素数を入力
		a=new int[x];


		for(int i=0; i<x; i++){
			a[i] = new Random().nextInt(10) +1 ;
		}


		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}
