package section06;

public class Q05MyClassTest {
	//別クラスのメソッドを実行するプログラム
	//実行クラス

	public static void main(String[] args) {

		Q05MyClass mc = new Q05MyClass(10, 50);
		System.out.println( mc.calc(100) );

		System.out.println( mc.calc(100, 200) );

	}

}
