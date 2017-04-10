package section12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Q04ExFileIO2 {
	//キーボードから入力した文字列を、テキストファイルに出力するプログラム

	public static void main(String[] args) {

		String inData;

		try {
			InputStreamReader srObj = new InputStreamReader (System.in);
			BufferedReader bObj = new BufferedReader (srObj);
			FileWriter fw = new FileWriter ("c:\\jsample\\FileIOTest.txt", true );
			BufferedWriter br = new BufferedWriter (fw);
			PrintWriter oWt = new PrintWriter (br);
			while ( ! ( inData = bObj.readLine() ).equals("1") ){
				System.out.println(inData);
				oWt.println(inData);
			}
			oWt.close();
		}
		catch (IOException errlnf){
			System.out.println("入力エラー" + errlnf );
		}

	}
}
