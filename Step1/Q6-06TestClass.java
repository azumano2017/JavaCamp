package section06;

public class Q06TestClass {
	//文字列型引数「msg」を1つ持つメソッド「Dispmsg」が、1つだけのくらす「MsgView」を定義するプログラム
	//実行クラス

	public static void main(String[] args) {

		Q06MsgView mc = new Q06MsgView();
		mc.Dispmsg("クラスから呼び出したメソッド");

	}

}
