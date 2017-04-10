package section10;

public class Q09Except17 {
	//例外処理 どのような出力結果が得られるかの確認

	static int a = 10, b = 0;


	static void Except17Method2() throws ArithmeticException {
		System.out.println("①  a=" + a + ", b=" + b );
		a = a / b;
	}


	static void Except17Method() throws ArithmeticException {
		Except17Method2();
		System.out.println("②  a=" + a + ", b=" + b );
	}


	public static void main(String[] args) {

		try {
			Except17Method();
			System.out.println("③  a=" + a + ", b=" + b );

		}
		catch ( ArithmeticException errlnf ){
			System.out.println("④  a=" + a + ", b=" + b );
		}
		finally {
			System.out.println("⑤  a=" + a + ", b=" + b );
		}

	}

}
