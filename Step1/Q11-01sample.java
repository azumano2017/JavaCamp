package section11;

import java.util.ArrayList;

public class Q01sample {
	//ArrayListのオブジェクトを生成するプログラム

	public static void main(String[] args) {

		//リストの値に文字列を入れる場合
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add(0, "2");
		ar1.add(1, "4");
		ar1.add(2, "6");

		//キャスト(型変換)する必要がない
		String mozi1 = ar1.get(0);
		String mozi2 = ar1.get(1);
		String mozi3 = ar1.get(2);

		System.out.println( mozi1 );
		System.out.println( mozi2 );
		System.out.println( mozi3 );


		//リストの値に数値を入れる場合
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(0, 3);
		ar2.add(1, 6);
		ar2.add(2, 9);

		//キャスト(型変換)する必要がない
		int kazu1 = ar2.get(0);
		int kazu2 = ar2.get(1);
		int kazu3 = ar2.get(2);

		System.out.println( kazu1 );
		System.out.println( kazu2 );
		System.out.println( kazu3 );
	}

}
