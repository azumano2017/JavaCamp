package section1;

public class Question06 {
	//底辺の1辺の長さ(length)と高さ(height)をキーボードから入力して
	//四角錘の体積を求めるプログラム

	public static void main(String[] args) {

		int l;       //長さ
		int h;       //高さ
		double v;    //体積

		System.out.print("length=");
		l = new java.util.Scanner ( System.in).nextInt();

		System.out.print("height=");
		h = new java.util.Scanner ( System.in).nextInt();

		v = l * l * h / 3.0;

		System.out.print("体積=" + v );
	}

}
