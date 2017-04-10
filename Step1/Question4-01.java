package section4;

public class Question01 {
	//int型で要素数5の配列numbersを準備し、配列の先頭から5,4,3,2,1を代入して表示するプログラム

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };

		for ( int i=0; i<numbers.length; i++){
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
	}

}
