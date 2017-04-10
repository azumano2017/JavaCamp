package section06;

public class Q14Hero {
	//名前、身長、体重、年齢をメンバとしてもつ「Heroクラス」を生成するプログラム

	Q14Hero suzuki;
	Q14Hero tanaka;

	private String name;
	private int height;
	private int weight;
	private int age;


	// コンストラクタ
	public Q14Hero(String name, int height, int weight, int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;

	}


	// getter
	public String getName() {return this.name;}
	public int getHeight(){return this.height;}
	public int getWeight(){return this.weight;}
	public int getAge(){return this.age;}


	public int gainWeight(int x){
		this.weight += x;
		return this.weight;
	}


	public int reduceWeight(int x){
		this.weight -= x;
		return this.weight;
 	}

}
