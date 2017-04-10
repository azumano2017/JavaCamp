package section05;

public class Question09MyOverLoad {
	//オーバーロードの利用

	public static void showType(int i){

		System.out.println("引数" + i + "は整数です。");
	}

	public static void showType(String s){
		System.out.println("引数" + s + "は文字列です。");
	}

}
