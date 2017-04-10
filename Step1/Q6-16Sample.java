package section06;

public class Q16Sample {

	private int a;
	private int b;
	private int c;

	//コンストラクタ
	Q16Sample(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// a,b,cの和を取得
	int getSum() { return  this.a + this.b + this.c; }

	// a,b,cの値を表示して改行
	void print() {
		System.out.println("a=" + a + "  b=" + b +"  c=" + c);
	}

}
