package section06;

public class Q11BodyMassIndexTest {
	//名前、身長、体重を引数にBMIを計算して返却するプログラム

	public static void main(String[] args) {

		Q11BodyMassIndex[] bmi = new Q11BodyMassIndex[5];
		bmi[0] = new Q11BodyMassIndex("鈴木一郎", 180, 65);
		bmi[1] = new Q11BodyMassIndex("田中大輔", 170, 69);
		bmi[2] = new Q11BodyMassIndex("山田花子", 165, 45);
		bmi[3] = new Q11BodyMassIndex("村田裕子", 169, 50);
		bmi[4] = new Q11BodyMassIndex("早川紀子", 140, 46);


		for (int i=0; i<bmi.length; i++){
			System.out.printf("%s   %d   %d   %.2f   %s\n", bmi[i].getName(), bmi[i].getHeight(), bmi[i].getWeight(), bmi[i].getBmi(),bmi[i].getMessage());

		}

	}

}
