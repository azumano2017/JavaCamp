package section06;

public class Q14HeroSample {
	//名前、身長、体重、年齢をメンバとしてもつ「Heroクラス」を生成するプログラム
	//実行クラス

	public static void main(String[] args) {


		Q14Hero h = new Q14Hero(null, 0, 0, 0);
		h.suzuki = new Q14Hero ("鈴木次郎", 180, 75, 24);
		h.tanaka = new Q14Hero ("田中大輔", 170, 68, 46);


		h.suzuki.gainWeight(3);    //鈴木さんが3Kg太っちゃった
		h.tanaka.reduceWeight(2);  //田中さんが2Kg痩せちゃった


		System.out.println("氏名：" + h.suzuki.getName() + "  身長：" + h.suzuki.getHeight()
		+ "  体重：" + h.suzuki.getWeight() + "  年齢：" + h.suzuki.getAge() + "才");

		System.out.println("氏名：" + h.tanaka.getName() + "  身長：" + h.tanaka.getHeight()
		+ "  体重：" + h.tanaka.getWeight() + "  年齢：" + h.tanaka.getAge() + "才");
	}

}
