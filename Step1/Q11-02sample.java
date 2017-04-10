package section11;

import java.util.ArrayList;

public class Q02sample {
	//ArrayListのオブジェクトを生成するプログラム

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<args.length; i++){
			list.add(args[i]);
		}

		for (int i=0; i<list.size(); i++){
			String text = list.get(i);
			System.out.println(text);
		}

		if(list.isEmpty()){
			System.out.println("パラメータか未入力です");
		}else if (list.contains("OK")){
			System.out.println("OKが入力されました。");
		}else{
			System.out.println("OKが入力されていません。");
		}

	}

}
