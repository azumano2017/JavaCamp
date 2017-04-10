package section12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01MyStreamIO {
	//ファイルの操作
	//キーボードから入力した文字列を、ディスプレイに表示するプログラム

	public static void main(String[] args) {

		String inData;

		System.out.println("キーボードで入力した文字を、ディスプレイに表示します。\n");
		System.out.print("文字を入力してください：");


		try {
			InputStreamReader srObj = new InputStreamReader (System.in);
			BufferedReader bObj = new BufferedReader (srObj);
			inData = bObj.readLine();
			System.out.println(inData);
		}
		catch ( IOException errlnf ){
			System.out.println("入出力エラー" + errlnf );
		}


	}

}
