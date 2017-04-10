package section07;

public class Q01Sample111 {
	//「Super1」を継承した「SubSuper」を利用したプログラム
	//実行クラス

	public static void main(String[] args) {

		Q01SubSuper s = new Q01SubSuper();

		s.a = 5;
		s.b = 10;

		s.x = 15;
		s.y = 20;

		System.out.print( s.calc() );

	}

}
