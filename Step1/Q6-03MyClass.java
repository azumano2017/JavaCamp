package section06;

public class Q03MyClass {
	//別クラスの各メソッドを実行するプログラム

	int v1;
	int v2;

	public void add(){
		System.out.println( v1 * v2 );
	}


	public void calc(int a, int b){
		System.out.println( a * b );
	}


	public String addcalc(int x, int y){
		String answer = "正解は " + ( x + y );
		return answer;
	}

}
