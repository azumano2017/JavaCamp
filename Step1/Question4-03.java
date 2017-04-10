package section4;

public class Question03 {
	//文字が格納されている1次元配列sの内容が逆順になるように入れ替えるプログラム

	public static void main(String[] args) {
		//1次元配列ｓの内容が逆順になるプログラム

		int j;

		char[] s = { 'U', 'T', 'S', 'Y', 'S', 'T', 'E', 'M' };
		char[] x = new char[8];

		System.out.println(s);

		for( int i=0; i<s.length; i++ ){
			j = 7 - i;
			x[i] = s[j];
		}
		for( int i=0; i<s.length; i++ ){
			s[i] = x[i];

		}
		System.out.println(s);

	}
}
