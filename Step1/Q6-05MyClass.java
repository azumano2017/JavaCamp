package section06;

public class Q05MyClass {
	//別クラスのメソッドを実行するプログラム

	int a;
	int b;

	Q05MyClass(int x, int y){
		a = x;
		b = y;
	}


	public void calc() {
		System.out.println( a * b );
	}


	public int calc(int var1){
		return a * var1;
	}


	public int calc(int var1, int var2){
		int answer = (var1 + var2) * b;
		return answer;
	}

}
