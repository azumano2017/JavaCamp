package section1;

public class Question03 {

	public static void main(String[] args) {
		/*a=4, b=6, c=12 のとき、次の計算結果を出力するプログラムを作成
		1) a + b × c
		2) a × a + b × b + c × c
		3) ( a + b + c ) ÷ 3
		*/

		double a;
		double b;
		double c;

		a = 4.0;
		b = 6.0;
		c = 12.0;

		System.out.println( a + b * c );
		System.out.println( a * a + b * b + c * c );
		System.out.println( ( a + b + c) / 3 );
	}

}
