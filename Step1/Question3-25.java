package section3;

public class Question25 {
	//当分偏差列を表示するプログラム
	//但し初項をa、公差をbと、表示される項数をn個とする

	public static void main(String[] args) {
		//等差整列を表示するプログラム

		int x;
		int a;
		int b;
		int n;

		System.out.println("それぞれ入力してください。");
		System.out.print("初項→");
		a = new java.util.Scanner ( System.in ).nextInt ();
		System.out.print("公差→");
		b = new java.util.Scanner ( System.in ).nextInt ();
		System.out.print("表示される項数→");
		n = new java.util.Scanner ( System.in ).nextInt ();

		for ( int i = 0; i < n; i++ ) {
			x = a + i * b ;
			System.out.print(x + " ");
		}
	}
}
