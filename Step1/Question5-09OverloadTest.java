package section05;

public class Question09OverloadTest {
	//オーバーロードの利用
	//実行クラス

	public static void main(String[] args) {

		Question09MyOverLoad obj = new Question09MyOverLoad();

		obj.showType(10);
		obj.showType("こんにちは");

	}
}
