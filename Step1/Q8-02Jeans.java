package section08;

public class Q02Jeans extends Q02Pants {
	//衣類品小売業の在庫管理システム

	boolean buttonFront;   //ボタン

	Q02Jeans ( String code, int size, String color, boolean buttonFront ){
		super ( code, size, color );

		this.buttonFront = buttonFront;
	}

	public String toString(){
		return super.toString() + ","+ (buttonFront ? "button":"zipper");
	}
	//super.toString()で親のtoStringを実行

}
