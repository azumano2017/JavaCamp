package section07;

public class Q03MyThisSuper {
	//「MyOverride」を継承した「MyOverrideNew」を利用したプログラム
	//実行クラス

	public static void main(String[] args) {

		Q03MyOverrideNew obj = new Q03MyOverrideNew();

		obj.getWho();
		System.out.println( obj.whoName );

	}

}
