package section4;

import java.util.Random;

public class Question08 {
	//要素型がint型である配列を作り、全要素を1～10の乱数で埋めるプログラム
	//但し、同じ値はなしとする

	public static void main(String[] args) {

		int youso;
		int[] a;

		System.out.print("要素数：");
		youso = new java.util.Scanner ( System.in ).nextInt ();  //要素数を入力
		a=new int[youso];


		for(int i=0; i<youso; i++){
			a[i] = new Random().nextInt(11);

			int x = a[i];
			for( i = 0; i < youso ; i++){
				if(a[i] ==x)
				break;
			}
		}


		for(int j=0; j<a.length; j++){
			System.out.println(a[j]);
		}

	}

}
