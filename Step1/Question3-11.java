package section3;

public class Question11 {
	//1～30までの数で、偶数のみを表示するプログラム

	public static void main(String[] args) {

		for ( int i = 1; i <= 30; i++ ) {
			if ( i % 2 == 0 ){
				System.out.print(i + " ");
			}
		}
	}

}
