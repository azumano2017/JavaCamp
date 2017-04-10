package section10;

public class Q01Except11 {
	//例外処理 どのような出力結果が得られるかの確認

	public static void main(String[] args) {

		double d,e = 1.0;
		d = 0.0;

		try {
			if ( d > -0.001 & d < 0.001){
				throw new ArithmeticException ("ArithmeticException エラー1が発生");
			}
			e = 10.0 / d;
		}
		catch ( ArithmeticException errlnf ){
			e = 999.9;
			System.out.println ( "errlnf = " + errlnf );
		}
		finally {
			System.out.println( "d=" + d + ", e=" + e );
		}

	}

}
