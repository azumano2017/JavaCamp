package section3;

public class Question32 {
	//キーボードから入力された2つの整数の最大公約数を求めるプログラム

	public static void main(String[] args) {

		int m;
		int n;
		int r;

		System.out.println("最大公約数を求めるプログラム！");
		System.out.println("2つの数字を入力してください。");

		m = new java.util.Scanner ( System.in ).nextInt ();  //一つ目の数字
		n = new java.util.Scanner ( System.in ).nextInt ();  //二つ目の数字

		while((r = m % n) != 0 ) {  // m/n の余りが 0 でないならば
            m = n;
            n = r;
		}

        System.out.println( "最大公約数は " + n + " です。");
    }

}
