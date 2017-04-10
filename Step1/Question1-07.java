package section1;

public class Question07 {
	//変数 x の値と、変数 y の値を入れ替えるプログラム

	public static void main(String[] args) {

		int x;
		int y;
		int w;

		x = 20;
		y = 30;
		w = y;
		y = x;
		x = w;
		System.out.println("x=" + x + "y=" + y );
	}

}
