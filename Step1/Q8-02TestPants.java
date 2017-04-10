package section08;

public class Q02TestPants {

	public static void main(String[] args) {
		//衣類品小売業の在庫管理システム 実行クラス

		/*
		 * プログラムは、ある衣類品小売業A社の在庫管理システムで使用するクラスとそのテストクラスからなる。
		 * 現在A社で取り扱う商品はスラックスとジーンズであり、両方に共通な属性である品番、サイズ、
		 * および色は抽象クラスPantsで定義する。サイズ及び色については、それぞれの属性値が引数の値と
		 * 等しいかどうかを判定するメソッドとしてsizels及びcolorlsを定義する。
		 * ジーンズは打ち合いボタンであるか、ファスナー留めであるかを示す属性(buttonFront)を持つ。
		 */

		Q02Pants[] pants = {
				new Q02Slacks ("S1", 31, "Black"),
				new Q02Slacks ("S2", 31, "Black"),
				new Q02Jeans ("J1", 32, "Black",false),
				new Q02Jeans ("J2", 34, "blue", true),
		};

		String black = new String("Black");
		for (int i=0; i<pants.length; i++ ){
			System.out.println( pants[i] );
		}

		System.out.println( pants[0].sizels(31) );
		System.out.println( pants[1].colorls(black) );
		System.out.println( pants[2].sizels(30) );
		System.out.println( pants[3].colorls(black) );

	}

}
