package section06;

public class Q03MyClassTest {
	//別クラスの各メソッドを実行するプログラム
	//実行クラス

	public static void main(String[] args) {

		Q03MyClass mc = new Q03MyClass();
		mc.v1 = 100;
		mc.v2 = 200;

		mc.add();

		mc.calc(300, 400);

		String answer = mc.addcalc(500, 600);
		System.out.println( answer );

	}

}
