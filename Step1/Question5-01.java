package section05;

public class Question01 {
	//受け取ったint引数の値nが負であればｰ1を返し、0であれば0を返し、
	//正であれば1を返すメソッドsignOfを作成するプログラム

	public static int signOf(int n){

		if ( n < 0 ){
			return -1;
		}else if ( n == 0 ){
			return 0;
		}else {
			return 1;
		}
	}


	public static void main(String[] args) {

		System.out.print("整数値x：");
		int x = new java.util.Scanner(System.in).nextInt();
		int s = signOf(x);
		System.out.println("signOf(x)は" + s + "です");

	}

}
