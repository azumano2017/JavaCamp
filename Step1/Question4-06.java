package section4;

public class Question06 {
	//配列から任意の値を持つ要素を探索するプログラム
	//同一の値をもつ要素が複数存在する場合、最も末尾に位置する要素を見つけるプログラム

	public static void main(String[] args) {

		int x;
		int z;
		int i;
		int j;
		int[] a;

		System.out.print("要素数：");
		x = new java.util.Scanner ( System.in ).nextInt ();  //要素数を入力
		a=new int[x];

		for(i=0; i<x; i++){                              //
			System.out.print("a[" + i + "]:");
			a[i] = new java.util.Scanner ( System.in ).nextInt ();

		}
		System.out.print("探す数値：");
		z = new java.util.Scanner ( System.in ).nextInt ();

		for (j=x-1; j>0; j--) {
			if(z==a[j]) {
				break;
			}
		}
		if(j==0){
			System.out.println(z + "は、ありません。");
		}else{
			System.out.println(z + "は、a[" + j + "]にあります。");
		}

	}

}
