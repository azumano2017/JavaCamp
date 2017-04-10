package section3;

public class Question09 {
	//500円玉、100円玉、50円玉、10円玉の硬貨が使える自動販売機の問題
	//おつりに必要な硬貨の枚数を求めるプログラム
	//ただし、自動販売機のものはすべて120円の商品に限定する

	public static void main(String[] args) {

		final int TEIKA = 120;
		int shiharai;
		int otsuri;
		int hyakuen;
		int gojuen;
		int juen;


		System.out.print("支払金額を入力してください。");
		shiharai = new java.util.Scanner ( System.in ).nextInt ();
		System.out.println("支払金額は" + shiharai + "円です。");

		otsuri = shiharai - TEIKA;
		System.out.println("おつりは" + otsuri + "です。");

		hyakuen = otsuri / 100;
		System.out.print("100円の枚数は" + hyakuen + "です。");

		otsuri = otsuri % 100;
		gojuen = otsuri / 50;
		System.out.print("50円の枚数は" + gojuen + "です。");

		otsuri = otsuri % 50;
		juen = otsuri / 10;
		System.out.print("10円の枚数は" + juen + "です。");
	}


}
