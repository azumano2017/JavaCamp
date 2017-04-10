package section05;

import java.util.Scanner;

public class Question06 {
	/*配列aから要素a[ind]を削除するメソッドaryRmvを作成するプログラム
	 *削除はa[ind]より後ろの全要素を一つ前方にずらすことによって行うことにする
	 *なお、移動されずに余ってしまう末尾要素の値は変更しない
	 */

	public static void aryRmv(int[] a, int idx){

		for(int i=idx; i<a.length-1; i++){
			a[i] = a[i+1];
		}
	}

	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");

		int num = stdln.nextInt();
		int[] a = new int[num];

		for(int i=0; i<num; i++){
			System.out.print("a[" + i + "]:");
			a[i] = stdln.nextInt();
		}

		System.out.print("消去する要素のインデックス：");
		int idx = stdln.nextInt();
		aryRmv(a, idx);
		for(int i=0; i<num; i++){
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
