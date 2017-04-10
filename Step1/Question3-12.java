package section3;

public class Question12 {
	//身長(150cm～180cm)と標準体重の対応表を出力するプログラム
	//標準体重 = (身長 - 100) × 0.9

	public static void main(String[] args) {

		double sw;

		System.out.println("身長   標準体重");

		for ( int s = 150; s <= 180; s+=5 ) {
			sw = (s - 100) * 0.9;
			System.out.println(s + "      " + sw);

		}
	}
}
