package section11;

import java.util.ArrayList;

public class Q03ArrayListSample {

	public static void main(String[] args) {
		//ArrayListのオブジェクトを生成するプログラム

		ArrayList<String> list = new ArrayList<String>();

		System.out.print("何回入力しますか？：");
		int number = new java.util.Scanner(System.in).nextInt();

		for (int i=1; i<=number; i++){
			System.out.print(i + "個目の値を入力してください：");
			String menber = new java.util.Scanner(System.in).nextLine();
			list.add(i-1, menber);
		}

		System.out.println("入力されたデータは");
		for (String s : list){
			System.out.println(s);
		}
		System.out.println("です。");
	}

}
