package section06;

public class Q02MyClassTest {
	//5,6を引数に別クラスで計算した結果を返却するプログラム
	//実行クラス

	public static void main(String[] args) {

		Q02MyClass mc = new Q02MyClass();
		String answer = mc.addcalc(5,6);

		System.out.println(answer);

	}

}
