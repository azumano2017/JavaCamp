package section06;

public class Q11BodyMassIndex {

	// アクセス修飾子「private」 自分自身のクラスのみアクセスを許可する
	private String name;     // 氏名
	private int height;      // 身長
	private int weight;      // 体重
	private double bmi;      // BMI
	private String message;  //判定結果


	// コンストラクタ
	public Q11BodyMassIndex(String name,int height,int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	// getter と setter
	public String getName(){return this.name;}
	public int getHeight(){return this.height;}
	public int getWeight(){return this.weight;}


	// BMIの計算、返却
	public double getBmi(){
		this.bmi = this.weight / Math.pow(height/100.0, 2);  // 累乗
		return this.bmi;
	}


	public String getMessage(){
		if(this.bmi < 18.5){
			this.message = "やせすぎ";
		}else if(this.bmi < 25.0){
			this.message = "標準";
		}else if(this.bmi < 30.0){
			this.message = "肥満（1度）";
		}else if(this.bmi < 35.0){
			this.message = "肥満（2度）";
		}else if(this.bmi < 40.0){
			this.message = "肥満（3度）";
		}else if(this.bmi > 40.0){
			this.message = "肥満（4度）";
		}
		return message;

	}

}
