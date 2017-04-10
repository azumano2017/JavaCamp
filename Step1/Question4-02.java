package section4;

public class Question02 {
	//double型で要素数5の配列numberを準備し、配列の先頭から
	//1.1, 2.2, 3.3, 4.4, 5.5 を代入し表示するプログラム

	public static void main(String[] args) {

		double[] numbers = {1.1 , 2.2 , 3.3 , 4.4 , 5.5};

		for(int i=0; i<numbers.length; i++){
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}

	}
}
