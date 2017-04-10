package section06;

public class Q13HeroSample {
	//名前、身長、体重、年齢をメンバとして持つ「Heroクラス」を生成するプログラム
	//実行クラス

	public static void main(String[] args) {

		Q13Suzuki s = new Q13Suzuki();
		Q13Tanaka t = new Q13Tanaka();

		s.name = "鈴木次郎";
		s.height = 180;
		s.weight = 75;
		s.age = 24;

		t.name = "田中大輔";
		t.height = 170;
		t.weight = 68;
		t.age = 46;


		System.out.println
		("氏名：" + s.name + "  身長：" + s.height + "cm  体重："
		+ s.weight + "kg  年齢" + s.age + "才");
		System.out.println
		("氏名：" + t.name + "  身長：" + t.height + "cm  体重："
		+ t.weight + "kg  年齢" + t.age + "才");

	}

}
