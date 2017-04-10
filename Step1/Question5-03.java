package section05;

import java.util.Scanner;

public class Question03 {
	//1～nまでの全整数の和を求めて返すメソッドsumUpを作成するプログラム

	public static int sumUp(int n){

		int sum =0;
		for(int i=1; i<n+1; i++){
			sum += i;
		}
		return sum;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.println("1からxまでの和を求めます");
		int x;

		do{
			System.out.print("整数 x：");
			x =stdln.nextInt();
		}while(x<=0);

		System.out.println("1から" + x + "までの和は" + sumUp(x) + "です");

	}
}
